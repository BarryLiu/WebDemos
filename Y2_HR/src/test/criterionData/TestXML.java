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
		
	/*	String str="{third_kind_name=III级机构111, third_kind_sale_id=, third_kind_is_retail=, first_kind_name= I 级结构, second_kind_name= II级结构1, third_kind_id=1, second_kind_id=1, first_kind_id=1, id=1}";
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
		
		
		System.out.println("写入成功！");
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
		System.out.println("列的数据");
		for (Data data : columns) {
			System.out.println(data.toString());
		}
		System.out.println("查的数据");
		for (Object object : datas) {
			System.out.println(object);
		}
	}
	
	/*
	 *       
19.        //1.第一种 创建文档及设置根元素节点的方式  
20.          
21.        //创建文档的根节点  
22.//      Document document = DocumentHelper.createDocument();  
23.//      //创建文档的 根元素节点  
24.//      Element root = DocumentHelper.createElement("Person");  
25.//        document.setRootElement(root);  
26.          
27.        //2.第二种 创建文档及设置根元素节点的方式  
28.        Element root = DocumentHelper.createElement("Person");  
29.        Document document = DocumentHelper.createDocument(root);  
30.        //给根节点添加属性  
31.        root.addAttribute("学校", "南大").addAttribute("位置", "江西");  
32.          
33.        //给根节点添加孩子节点  
34.        Element element1 = root.addElement("学生");  
35.        element1.addElement("姓名").addAttribute("婚姻", "单身").addText("小章");  
36.        element1.addElement("年龄").addText("21");  
37.          
38.        Element element2 = root.addElement("学生");  
39.        element2.addElement("姓名").addAttribute("婚姻", "单身").addText("小红").addElement("爱好").addText("唱歌");  
40.        element2.addElement("年龄").addText("22");  
41.                  
42.          
43.        //把生成的xml文档存放在硬盘上  true代表是否换行  
44.        OutputFormat format = new OutputFormat("    ",true);  
45.        format.setEncoding("GBK");//设置编码格式  
46.        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("Person.xml"),format);  
47.      
48.        xmlWriter.write(document);  
49.        xmlWriter.close();  
50.    }  



<?xml version="1.0" encoding="GBK"?>  
02.  
03.<Person 学校="南大" 位置="江西">  
04.    <学生>  
05.        <姓名 婚姻="单身">小章</姓名>  
06.        <年龄>21</年龄>  
07.    </学生>  
08.    <学生>  
09.        <姓名 婚姻="单身">小红  
10.            <爱好>唱歌</爱好>  
11.        </姓名>  
12.        <年龄>22</年龄>  
13.    </学生>  
14.</Person>  

*/
	
	
	
}
