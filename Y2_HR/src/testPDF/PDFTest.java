package testPDF;

import java.io.FileOutputStream;
import java.io.OutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFTest {

	// POI

	private static String[] titles = new String[] { "name", "age", "sex" };

	public static void main(String[] args) throws Exception {
		// 创建一个PDF的文档对象
		Document doc = new Document();

		// 把文档对象和输出流关联，便于最后输出
		OutputStream os = new FileOutputStream("H:/test.pdf");
		PdfWriter writer = PdfWriter.getInstance(doc, os);

		// 开启文档
		doc.open();

		// "C:/WINDOWS/Fonts/simhei.ttf"
		BaseFont font = BaseFont.createFont("C:/WINDOWS/Fonts/SIMKAI.ttf",
				BaseFont.IDENTITY_H, BaseFont.EMBEDDED);

		// 实例化表格对象
		PdfPTable table = new PdfPTable(3);

		table.addCell("下");
		table.addCell("说法");
		table.addCell(new Paragraph("沙发上", new Font(font)));
		table.completeRow();// 换行

		table.addCell("1");
		table.addCell("2");
		table.addCell("3");
		table.completeRow();

		doc.add(table);
		// writer.add(table);
		// 关闭文档
		doc.close();
		writer.close();

		System.out.println("ok");
	}
}
