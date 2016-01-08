package test.criterionData;

import hr.entity.Data;
import hr.mapperdao.DataMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

/**
 * jxl 测试框架的基本使用
 * @author Eung-yuong Liu
 *
 */
public class TestExcel {
	private static ApplicationContext cxt = null;
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		
		cxt = new ClassPathXmlApplicationContext(
				"spring/applicationContext-*.xml");
		
		DataMapper dataMapper= (DataMapper) cxt.getBean("dataMapper");
		 
		 List<Data> kinds = dataMapper.selectByTableName("engage_resume");
		 for (Data data : kinds) {
			System.out.println(data);
		} 
		  //List<Object> datas = dataMapper.selectByTableAndColumns("engage_resume", "*");
		// test1(kinds,datas);
	}
	
	private static void test1(List<Object> kinds,List<Object> datas) throws IOException, WriteException,
			RowsExceededException {
		
		//WorkbookSettings ws = new WorkbookSettings();
		
		File file = new File("H:/test/jxl.xls");
		WritableWorkbook wwb = Workbook.createWorkbook(file);
		WritableSheet sheet = wwb.createSheet("mySheet1", 0);
		
		Object object = datas.get(0);
		String dataStr=object.toString();
		dataStr =dataStr.substring(1, dataStr.length()-1);
//		String[] arrStr=dataStr.split(", ");
//		for (int i = 0; i < arrStr.length; i++) {
//			String[] arr = arrStr[i].split("=");
//			Label label = new Label(i, 0, arr[0]);
//			sheet.addCell(label);
//		}
		for (int i = 0; i < datas.size(); i++) {
			String data=datas.get(i).toString();
			  data =data.substring(1, data.length()-1);
			 
			String[] arrStr1=data.split(", ");
			for (int j=0 ;j<arrStr1.length;j++) {
				String str=arrStr1[j];
				String[] arrS = str.split("=");
				if(arrS.length==2){
					Label label = new Label(j, i+1, arrS[1]);
					sheet.addCell(label);
				}
			}
		}
		
		wwb.write();
		wwb.close();
		System.out.println("OK..");
	}
	
	
}
 