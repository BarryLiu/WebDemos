package test.criterionData;

import hr.entity.Data;
import hr.mapperdao.DataMapper;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXML {
	private static ApplicationContext cxt = null;
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		
	/*	String str="{third_kind_name=III������111, third_kind_sale_id=, third_kind_is_retail=, first_kind_name= I ���ṹ, second_kind_name= II���ṹ1, third_kind_id=1, second_kind_id=1, first_kind_id=1, id=1}";
		str = str.substring(1,str.length()-1);
		String[] arrStr = str.split(", ");
		for (String string : arrStr) {
			System.out.println(string);
			try{
				String[] split = string.split("=");
				System.out.println(split[0]+"--"+split[1]);
				
			}catch(RuntimeException e){
			}
		}
		*/
		
		cxt = new ClassPathXmlApplicationContext(
				"spring/applicationContext-*.xml");
		
		testDom4j("config_question_second_kind");
	}
	private static void testDom4j(String tableName) throws IOException {
		
		DataMapper mapper = (DataMapper) cxt.getBean("dataMapper");
		
		List<Data> columns = mapper.selectByTableName(tableName);
		List<Object> datas = mapper.selectByTableAndColumns(tableName, "*");
		
		
		
		writeXml(tableName, columns,datas);
		
		
		System.out.println("д��ɹ���");
	}
	private static void writeXml(String tableName, List<Data> columns,List<Object> datas)
			throws FileNotFoundException, UnsupportedEncodingException,
			IOException {
		
		print(columns, datas);
		
		
		Element root = DocumentHelper.createElement(tableName+"s");
		Document document = DocumentHelper.createDocument(root);
		
		for (Object object : datas) {	
			String columnJson = object.toString();
			String column = columnJson.substring(1, columnJson.length()-1);
			String [] col = column.split(", ");
			Element element1 = root.addElement(tableName);
			
			for (Data data : columns) {
				for (String string : col) {
					String[] str = string.split("=");
					if(data.getColumnName().equals(str[0]) ){
						try{								
							element1.addElement(str[0]).addText(str[1]);
						}catch(RuntimeException e){
						}
					}
				}
			}
		}

		OutputFormat fmt =new OutputFormat("  ",true);
		fmt.setEncoding("utf-8");
		FileOutputStream out =new FileOutputStream("H:/test/"+tableName+".xml");
		XMLWriter writer = new XMLWriter(out , fmt);
		
		writer.write(document);
		writer.close();
	}
	private static void print(List<Data> columns, List<Object> datas) {
		System.out.println("�е�����");
		for (Data data : columns) {
			System.out.println(data.toString());
		}
		System.out.println("�������");
		for (Object object : datas) {
			System.out.println(object);
		}
	}
	
	/*
	 *       
19.        //1.��һ�� �����ĵ������ø�Ԫ�ؽڵ�ķ�ʽ  
20.          
21.        //�����ĵ��ĸ��ڵ�  
22.//      Document document = DocumentHelper.createDocument();  
23.//      //�����ĵ��� ��Ԫ�ؽڵ�  
24.//      Element root = DocumentHelper.createElement("Person");  
25.//        document.setRootElement(root);  
26.          
27.        //2.�ڶ��� �����ĵ������ø�Ԫ�ؽڵ�ķ�ʽ  
28.        Element root = DocumentHelper.createElement("Person");  
29.        Document document = DocumentHelper.createDocument(root);  
30.        //�����ڵ��������  
31.        root.addAttribute("ѧУ", "�ϴ�").addAttribute("λ��", "����");  
32.          
33.        //�����ڵ���Ӻ��ӽڵ�  
34.        Element element1 = root.addElement("ѧ��");  
35.        element1.addElement("����").addAttribute("����", "����").addText("С��");  
36.        element1.addElement("����").addText("21");  
37.          
38.        Element element2 = root.addElement("ѧ��");  
39.        element2.addElement("����").addAttribute("����", "����").addText("С��").addElement("����").addText("����");  
40.        element2.addElement("����").addText("22");  
41.                  
42.          
43.        //�����ɵ�xml�ĵ������Ӳ����  true�����Ƿ���  
44.        OutputFormat format = new OutputFormat("    ",true);  
45.        format.setEncoding("GBK");//���ñ����ʽ  
46.        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("Person.xml"),format);  
47.      
48.        xmlWriter.write(document);  
49.        xmlWriter.close();  
50.    }  



<?xml version="1.0" encoding="GBK"?>  
02.  
03.<Person ѧУ="�ϴ�" λ��="����">  
04.    <ѧ��>  
05.        <���� ����="����">С��</����>  
06.        <����>21</����>  
07.    </ѧ��>  
08.    <ѧ��>  
09.        <���� ����="����">С��  
10.            <����>����</����>  
11.        </����>  
12.        <����>22</����>  
13.    </ѧ��>  
14.</Person>  

*/
	
	
	
}
