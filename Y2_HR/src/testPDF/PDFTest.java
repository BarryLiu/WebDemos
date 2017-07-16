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
		// ����һ��PDF���ĵ�����
		Document doc = new Document();

		// ���ĵ���������������������������
		OutputStream os = new FileOutputStream("H:/test.pdf");
		PdfWriter writer = PdfWriter.getInstance(doc, os);

		// �����ĵ�
		doc.open();

		// "C:/WINDOWS/Fonts/simhei.ttf"
		BaseFont font = BaseFont.createFont("C:/WINDOWS/Fonts/SIMKAI.ttf",
				BaseFont.IDENTITY_H, BaseFont.EMBEDDED);

		// ʵ����������
		PdfPTable table = new PdfPTable(3);

		table.addCell("��");
		table.addCell("˵��");
		table.addCell(new Paragraph("ɳ����", new Font(font)));
		table.completeRow();// ����

		table.addCell("1");
		table.addCell("2");
		table.addCell("3");
		table.completeRow();

		doc.add(table);
		// writer.add(table);
		// �ر��ĵ�
		doc.close();
		writer.close();

		System.out.println("ok");
	}
}
