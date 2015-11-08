package test.criterionData;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Test2 {
	public static void main(String[] args) throws Exception {
		teach();
		
		//BaseFont ttChinese=BaseFont.createFont("C:/WINDOWS/Fonts/simsunb.ttf",BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
		//System.out.println(ttChinese);
		System.out.println("OK..");
	}

	private static void teach() throws DocumentException,
			FileNotFoundException, IOException {
		Document doc = new Document();
		PdfWriter.getInstance(doc, new FileOutputStream("H:/test/test1.pdf"));
		doc.open();
		PdfPTable table = new PdfPTable(2);
//		BaseFont font = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H",
//				BaseFont.NOT_EMBEDDED);
		BaseFont font=BaseFont.createFont("C:/WINDOWS/Fonts/SIMKAI.ttf",BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
		table.addCell(new Paragraph("±àºÅ", new Font(font)));
		table.addCell("ÐÕÃû");
		table.completeRow();
		table.addCell("1");
		table.addCell("Jack");
		doc.add(table);
		doc.close();
	}
}
