package test.criterionData;

import hr.entity.Data;
import hr.mapperdao.DataMapper;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import jxl.write.Label;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.io.StreamUtil;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class TestPdf {
	private static ApplicationContext cxt = null;

	public static void main(String[] args) throws IOException,
			RowsExceededException, WriteException, DocumentException {
		cxt = new ClassPathXmlApplicationContext(
				"spring/applicationContext-*.xml");

		testItext("config_file_second_kind");
	}

	private static void testItext(String tableName) throws IOException,
			DocumentException {

		DataMapper mapper = (DataMapper) cxt.getBean("dataMapper");

		List<Data> columns = mapper.selectByTableName(tableName);
		List<Object> datas = mapper.selectByTableAndColumns(tableName, "*");

		print(columns, datas);

		writePdf(tableName, columns, datas);
		System.out.println("写入成功！");
	}

	/** 打印数据 */
	private static void print(List<Data> columns, List<Object> datas) {
		System.out.println(columns.size() + "columns ==========");
		for (Data data : columns) {
			System.out.println(data);
		}
		System.out.println(datas.size() + "datas ==========");
		for (Object object : datas) {
			System.out.println(object);
		}
	}

	private static void writePdf(String tableName, List<Data> datas,
			List<Object> columns) throws DocumentException, IOException {
		
		
		Document doc =new Document();
		
		OutputStream os =new FileOutputStream("H://test/"+tableName+".pdf");
		PdfWriter writer = PdfWriter.getInstance(doc, os);
		doc.open();
		PdfPTable table =new PdfPTable(datas.size());
		//BaseFont font =BaseFont.createFont("STSong-Light", "UniGB-UCS2-H",BaseFont.NOT_EMBEDDED);

		BaseFont font = BaseFont.createFont("C:/WINDOWS/Fonts/SIMKAI.ttf",BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
	
		for (Data data: datas) {					//1添加  没列的标题
			table.addCell(new Paragraph(data.getColumnName(), new Font(font)));
		}
		table.completeRow();
 
		// 2. 给它插入数据
		for (int i = 0; i < columns.size(); i++) {
			String data=columns.get(i).toString();
			  data =data.substring(1, data.length()-1);
			
			String[] arrStr1=data.split(", ");
			
			for (Data data2 : datas) {
				
			for (int j=0 ;j<arrStr1.length;j++) {
				String str=arrStr1[j];
				String[] arrS = str.split("=");
				if(data2.getColumnName().equals(arrS[0])){
					try{						
						table.addCell(new Paragraph(arrS[1],new Font(font)));
					}catch(RuntimeException e){
						e.printStackTrace();
						table.addCell("");
					}
					break;
				}
			}
			}
		}
		table.completeRow();
		
		writer.add(table);
		doc.add(table);
		doc.close();
	}
}
