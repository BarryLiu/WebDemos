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

	/**�õ����еı���*/
	public List<Object> selectData() {
		return dataMapper.selectTables();
	}

	/**���ݱ��� �õ��������е���*/
	public List<Data> selectParams(String tableName) {
		return dataMapper.selectByTableName(tableName);
	}

	/**����excel �ļ�
	 * @throws IOException 
	 * @throws WriteException 
	 * @throws RowsExceededException */
	public String initExcel(String tabName) throws IOException, RowsExceededException, WriteException {
		String[] field = ServletActionContext.getRequest().getParameterValues("field");
		String fileName = ServletActionContext.getRequest().getParameter("tableComment");
		File file = new File("H:/test/"+fileName+"��.xls");	// ����excel ��
		WritableWorkbook wwb = Workbook.createWorkbook(file);
		WritableSheet sheet = wwb.createSheet("mySheet1", 0);

		createExcelTop(tabName, field, sheet);
		
		insertExcelData(tabName, field, sheet);
 
		// д����
		wwb.write();
		wwb.close();
		return "���ɳɹ���";
	}
	/**�������ݵ���Ӧ������*/
	private void insertExcelData(String tabName, String[] field,
			WritableSheet sheet) throws WriteException, RowsExceededException {
		
		// ����Ҫ��ѯ����
		String fieldStr = Arrays.toString(field);
		fieldStr=fieldStr.substring(1, fieldStr.length()-1);
		System.out.println("fieldStr"+fieldStr);
		
		//��ѯ��Ҫ���������
		List<Object> columns = dataMapper.selectByTableAndColumns(tabName, fieldStr);
		System.out.println("============");
		System.out.println("Ҫ�������Ϣ��������   "+columns.size());
		
		for (int i = 0; i < columns.size(); i++) {						// ���ݿ��в�ѯ����ÿ��Щ��       ״̬��{aa=a1, bb=b1, cc=c1}
			// ��ÿһ�����ݴ�json ���ݽ���������
			String columnJson = columns.get(i).toString();
			String column = columnJson.substring(1, columnJson.length()-1);
			String [] col = column.split(", ");
//			System.out.println(Arrays.toString(col));
			
			for (int j = 0; j < col.length; j++) {						//����Щ��  �ָ�õ�����ѭ���Ա����      ״̬     bb=b1
				String [] str=col[j].split("=");
				
				for (int k = 0; k < field.length; k++) {				// ���forѭ�����  ��������ݶ�Ӧ���������       ����һ��ArrayIndexOutOfBoundsException: bug δ��� 
					if(str[0].equals(field[k])){
						WritableCell label =new Label(k,i+1,str[1]);;
						sheet.addCell(label);
					}
				}
			}
			
		}
	}
	/**������ݵ��е�����*/
	private void createExcelTop(String tabName, String[] field,
			WritableSheet sheet) throws WriteException, RowsExceededException {
		List<Data> columns = dataMapper.selectByTableName(tabName);		//������ݵ��е�����
		
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
	 * ����xml ���ļ�  
	 * @param tableName
	 * @return
	 * @throws IOException 
	 * @throws UnsupportedEncodingException 
	 * @throws FileNotFoundException 
	 */
	public String initXml(String tableName) {
		// ����Ҫ��ѯ����
			String[] field = ServletActionContext.getRequest().getParameterValues("field");
			String fieldStr = Arrays.toString(field);
			fieldStr=fieldStr.substring(1, fieldStr.length()-1);
			System.out.println("fieldStr"+fieldStr); 
		
			
			List<Object> columns = dataMapper.selectByTableAndColumns(tableName, fieldStr); //��ѯҪд������
			List<Data> datas = dataMapper.selectByTableName(tableName);
			if(columns.size()==0){
				return "û�����ݲ���Ҫ���ɱ���";
			}
			try {
				writeXml(tableName,datas,columns);
			} catch (IOException e) {
				return "����ʧ����";
			}
			
		return "���ɳɹ���";
	}
	/**д��xml ��ʽ�����ݱ���*/
	private  void writeXml(String tableName, List<Data> columns,List<Object> datas)
			throws FileNotFoundException, UnsupportedEncodingException,
			IOException {
		
		
		
		Element root = DocumentHelper.createElement(tableName+"s");			// ������s  �������Ľڵ�
		Document document = DocumentHelper.createDocument(root);
		
		for (Object object : datas) {										//ѭ���߼���ӽڵ�
			String columnJson = object.toString();
			String column = columnJson.substring(1, columnJson.length()-1);
			String [] col = column.split(", ");
			Element element1 = root.addElement(tableName);
			
			for (Data data : columns) {
				for (String string : col) {
					String[] str = string.split("=");
					if(data.getColumnName().equals(str[0]) ){
						try{												//��� str[1] û��ֵ�û������쳣 ��Ҳ������д��
							element1.addElement(str[0]).addText(str[1]);
						}catch(RuntimeException e){
						}
					}
				}
			}
		}

		OutputFormat fmt =new OutputFormat("  ",true);
		fmt.setEncoding("utf-8");
		FileOutputStream out =new FileOutputStream("H:/test/"+tableName+".xml");	//д��ȥ  �Ա�������
		XMLWriter writer = new XMLWriter(out , fmt);
		
		writer.write(document);
		writer.close();
	}

	
	
	
	
	
	
	
	public String initPdf(String tableName) {

		// ����Ҫ��ѯ����
					String[] field = ServletActionContext.getRequest().getParameterValues("field");
					String fieldStr = Arrays.toString(field);
					fieldStr=fieldStr.substring(1, fieldStr.length()-1);
					System.out.println("fieldStr"+fieldStr); 
				
					
					List<Object> columns = dataMapper.selectByTableAndColumns(tableName, fieldStr); //��ѯҪд������
					for (Object object : columns) {
						System.out.println(object);
					}
					List<Data> datas = dataMapper.selectByTableName(tableName);
					if(columns.size()==0){
						return "û�����ݲ���Ҫ���ɱ���";
					}
					
			try {
				writePdf(field,tableName,datas,columns);
			}   catch (Exception e) {
				e.printStackTrace();
				return "����ʧ�ܣ�";
			}
					
		return "���ɳɹ���";
	}

	/**д��PDF ��ʽ�����ݱ���
	 * @throws DocumentException 
	 * @throws IOException */
	private void writePdf(String [] field,String tableName, List<Data> datas,
			List<Object> columns) throws DocumentException, IOException {

		com.itextpdf.text.Document doc =new com.itextpdf.text.Document();
		String tableComment = ServletActionContext.getRequest().getParameter("tableComment"); // �õ��������������� 
		OutputStream os =new FileOutputStream("H://test/"+tableComment+".pdf");
		PdfWriter writer = PdfWriter.getInstance(doc, os);
		doc.open();
		PdfPTable table =new PdfPTable(field.length);
		//BaseFont font =BaseFont.createFont("STSong-Light", "UniGB-UCS2-H",BaseFont.NOT_EMBEDDED);

		BaseFont font = BaseFont.createFont("C:/WINDOWS/Fonts/SIMKAI.ttf",BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
	
		writerPdfTitle(field, datas, table, font);  // дͷ����ÿһ��
		table.completeRow();  // ����
		writerPdfData(field, columns, table, font);  // д����
		
		
		writer.add(table);
		doc.add(table);
		 doc.close();
	}

	/**������д��ȥ*/
	private void writerPdfTitle(String[] field, List<Data> datas,
			PdfPTable table, BaseFont font) {
		for (String fed : field) {
			for (Data data: datas) {				//1���  û�еı���
				if(data.getColumnName().equals(fed)){
					table.addCell(new Paragraph(data.getColumnComment(), new Font(font)));
					break;
				}
			}
		}
	}
	/** ѭ��  ������������ , */
	private void writerPdfData(String[] fields, List<Object> columns,
			PdfPTable table, BaseFont font) {
		// 2. ������������
		for (int i = 0; i < columns.size(); i++) {
			String data=columns.get(i).toString();
			  data =data.substring(1, data.length()-1);
			String[] arrStr1=data.split(", ");
			for (String field : fields) {
				boolean noCurrCol =true; 				// ����  ���ö�û�������  ���������ѭ���ҵ��˾͸�Ϊ false  ���û�ҵ������һ���յ�  
			for (int j=0 ;j<arrStr1.length;j++) {
				String str=arrStr1[j];
				String[] arrS = str.split("=");
				if(field.equals(arrS[0])){
					try{
						if(arrS[1]!=null)									// mysql �ڲ�ѯΪ  "" ���л��� xxxx=, �� ��Ϊnull ���� �������� �������������ѭ����ƥ��   noCurrCol ����ֲ���������������
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
		table.completeRow();  // д��һ�� �ύһ��
	}
	
}
