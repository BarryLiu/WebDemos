package hr.service.criterionData;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.apache.catalina.tribes.util.Arrays;
import org.apache.struts2.ServletActionContext;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import hr.entity.Data;
import hr.service.BaseService;

public class DataService extends BaseService{

	/**得到所有的表名*/
	public List<Object> selectData() {
		return dataMapper.selectTables();
	}

	/**根据表名 得到他的所有的列*/
	public List<Data> selectParams(String tableName) {
		return dataMapper.selectByTableName(tableName);
	}

	/**生成excel 文件
	 * @throws IOException 
	 * @throws WriteException 
	 * @throws RowsExceededException */
	public String initExcel(String tabName) throws IOException, RowsExceededException, WriteException {
		String[] field = ServletActionContext.getRequest().getParameterValues("field");
		String fileName = ServletActionContext.getRequest().getParameter("tableComment");
		File file = new File("H:/test/"+fileName+"表.xls");	// 创建excel 表
		WritableWorkbook wwb = Workbook.createWorkbook(file);
		WritableSheet sheet = wwb.createSheet("mySheet1", 0);

		createExcelTop(tabName, field, sheet);
		
		insertExcelData(tabName, field, sheet);
 
		// 写完了
		wwb.write();
		wwb.close();
		return "生成成功！";
	}
	/**插入数据到对应的列中*/
	private void insertExcelData(String tabName, String[] field,
			WritableSheet sheet) throws WriteException, RowsExceededException {
		
		// 生成要查询的列
		String fieldStr = Arrays.toString(field);
		fieldStr=fieldStr.substring(1, fieldStr.length()-1);
		System.out.println("fieldStr"+fieldStr);
		
		//查询出要插入的数据
		List<Object> columns = dataMapper.selectByTableAndColumns(tabName, fieldStr);
		System.out.println("============");
		System.out.println("要插入的信息的条数：   "+columns.size());
		
		for (int i = 0; i < columns.size(); i++) {						// 数据库中查询到的每这些列       状态：{aa=a1, bb=b1, cc=c1}
			// 将每一条数据从json 数据解析到出来
			String columnJson = columns.get(i).toString();
			String column = columnJson.substring(1, columnJson.length()-1);
			String [] col = column.split(", ");
//			System.out.println(Arrays.toString(col));
			
			for (int j = 0; j < col.length; j++) {						//将这些列  分割好的数据循环以便插入      状态     bb=b1
				String [] str=col[j].split("=");
				
				for (int k = 0; k < field.length; k++) {				// 这个for循环解决  插入的数据对应不齐的问题       还有一个ArrayIndexOutOfBoundsException: bug 未解决 
					if(str[0].equals(field[k])){
						WritableCell label =new Label(k,i+1,str[1]);;
						sheet.addCell(label);
					}
				}
			}
			
		}
	}
	/**添加数据的列的名称*/
	private void createExcelTop(String tabName, String[] field,
			WritableSheet sheet) throws WriteException, RowsExceededException {
		List<Data> columns = dataMapper.selectByTableName(tabName);		//添加数据的列的名称
		
		for (int i = 0; i < field.length; i++) {
			OUT:
			for (Data data : columns) {
				if(field[i].equals(data.getColumnName())){
					WritableCell label =new Label(i,0,data.getColumnComment());;
					sheet.addCell(label);
					break OUT;
				}
			}
		}
	}

	
	
	
	
	/**
	 * 生成xml 的文件  
	 * @param tableName
	 * @return
	 * @throws IOException 
	 * @throws UnsupportedEncodingException 
	 * @throws FileNotFoundException 
	 */
	public String initXml(String tableName) {
		// 生成要查询的列
			String[] field = ServletActionContext.getRequest().getParameterValues("field");
			String fieldStr = Arrays.toString(field);
			fieldStr=fieldStr.substring(1, fieldStr.length()-1);
			System.out.println("fieldStr"+fieldStr); 
		
			
			List<Object> columns = dataMapper.selectByTableAndColumns(tableName, fieldStr); //查询要写的数据
			List<Data> datas = dataMapper.selectByTableName(tableName);
			if(columns.size()==0){
				return "没有数据不需要生成报表";
			}
			try {
				writeXml(tableName,datas,columns);
			} catch (IOException e) {
				return "生成失败了";
			}
			
		return "生成成功！";
	}
	/**写成xml 格式的数据报表*/
	private  void writeXml(String tableName, List<Data> columns,List<Object> datas)
			throws FileNotFoundException, UnsupportedEncodingException,
			IOException {
		
		
		
		Element root = DocumentHelper.createElement(tableName+"s");			// 表名加s  生成最大的节点
		Document document = DocumentHelper.createDocument(root);
		
		for (Object object : datas) {										//循环逻辑添加节点
			String columnJson = object.toString();
			String column = columnJson.substring(1, columnJson.length()-1);
			String [] col = column.split(", ");
			Element element1 = root.addElement(tableName);
			
			for (Data data : columns) {
				for (String string : col) {
					String[] str = string.split("=");
					if(data.getColumnName().equals(str[0]) ){
						try{												//如果 str[1] 没有值得话会抛异常 但也能正常写入
							element1.addElement(str[0]).addText(str[1]);
						}catch(RuntimeException e){
						}
					}
				}
			}
		}

		OutputFormat fmt =new OutputFormat("  ",true);
		fmt.setEncoding("utf-8");
		FileOutputStream out =new FileOutputStream("H:/test/"+tableName+".xml");	//写出去  以表名命名
		XMLWriter writer = new XMLWriter(out , fmt);
		
		writer.write(document);
		writer.close();
	}

	
	
	
	
	
	
	
	public String initPdf(String tableName) {

		// 生成要查询的列
					String[] field = ServletActionContext.getRequest().getParameterValues("field");
					String fieldStr = Arrays.toString(field);
					fieldStr=fieldStr.substring(1, fieldStr.length()-1);
					System.out.println("fieldStr"+fieldStr); 
				
					
					List<Object> columns = dataMapper.selectByTableAndColumns(tableName, fieldStr); //查询要写的数据
					for (Object object : columns) {
						System.out.println(object);
					}
					List<Data> datas = dataMapper.selectByTableName(tableName);
					if(columns.size()==0){
						return "没有数据不需要生成报表";
					}
					
			try {
				writePdf(field,tableName,datas,columns);
			}   catch (Exception e) {
				e.printStackTrace();
				return "生成失败！";
			}
					
		return "生成成功！";
	}

	/**写成PDF 格式的数据报表
	 * @throws DocumentException 
	 * @throws IOException */
	private void writePdf(String [] field,String tableName, List<Data> datas,
			List<Object> columns) throws DocumentException, IOException {

		com.itextpdf.text.Document doc =new com.itextpdf.text.Document();
		String tableComment = ServletActionContext.getRequest().getParameter("tableComment"); // 得到这个表的中文名称 
		OutputStream os =new FileOutputStream("H://test/"+tableComment+".pdf");
		PdfWriter writer = PdfWriter.getInstance(doc, os);
		doc.open();
		PdfPTable table =new PdfPTable(field.length);
		//BaseFont font =BaseFont.createFont("STSong-Light", "UniGB-UCS2-H",BaseFont.NOT_EMBEDDED);

		BaseFont font = BaseFont.createFont("C:/WINDOWS/Fonts/SIMKAI.ttf",BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
	
		writerPdfTitle(field, datas, table, font);  // 写头部的每一列
		table.completeRow();  // 换行
		writerPdfData(field, columns, table, font);  // 写数据
		
		
		writer.add(table);
		doc.add(table);
		 doc.close();
	}

	/**讲列名写进去*/
	private void writerPdfTitle(String[] field, List<Data> datas,
			PdfPTable table, BaseFont font) {
		for (String fed : field) {
			for (Data data: datas) {				//1添加  没列的标题
				if(data.getColumnName().equals(fed)){
					table.addCell(new Paragraph(data.getColumnComment(), new Font(font)));
					break;
				}
			}
		}
	}
	/** 循环  给它插入数据 , */
	private void writerPdfData(String[] fields, List<Object> columns,
			PdfPTable table, BaseFont font) {
		// 2. 给它插入数据
		for (int i = 0; i < columns.size(); i++) {
			String data=columns.get(i).toString();
			  data =data.substring(1, data.length()-1);
			String[] arrStr1=data.split(", ");
			for (String field : fields) {
				boolean noCurrCol =true; 				// 首先  设置都没有这个列  ，如果里面循环找到了就改为 false  如果没找到就添加一个空的  
			for (int j=0 ;j<arrStr1.length;j++) {
				String str=arrStr1[j];
				String[] arrS = str.split("=");
				if(field.equals(arrS[0])){
					try{
						if(arrS[1]!=null)									// mysql 在查询为  "" 的列会有 xxxx=, 的 而为null 则列 都不会有 ，这样会造成列循环不匹配   noCurrCol 这个局部变量解决这个问题
						table.addCell(new Paragraph(arrS[1],new Font(font)));
					}catch(RuntimeException e){
						table.addCell("");
					}
					noCurrCol = false;
					break;
				}
			}
			if(noCurrCol){
				table.addCell("");
			}
			
			}
		}
		table.completeRow();  // 写完一行 提交一行
	}
	
}
