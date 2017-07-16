package hr.action.criterionData;

import java.io.IOException;
import java.util.List;
import java.util.Map;





import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import hr.entity.Data;
import hr.service.criterionData.DataService;

public class DataAction  {
	private DataService dataService;

	private List<Object> tables;
	private List<Data> columns;
	
	private String tableName;
	private String toGoSJsp;
	private String successMsg;
	
	/**当选择的表改变的时候就进行 查询新的表的列*/
	public String loadCloumns(){
		tables = dataService.selectData();
		columns= dataService.selectParams(tableName);
		return toGoSJsp;
	}
 
	public String excelLocate(){ // 进入	Excel标准数据报表  1
		
		tables = dataService.selectData();
		return "excel_locate";
	}
	public String initExcel() throws RowsExceededException, WriteException, IOException{  // 生成excel 文件
		 successMsg = dataService.initExcel(tableName);
		
		 tables = dataService.selectData();
		 return "excel_locate";
	}
	
	
	
	public String pdfLocate(){   //  进入	Pdf标准数据报表  2
		tables = dataService.selectData();
		return "pdf_locate";
	}
	
	
	public String initPdf(){  // 生成Pdf 文件
		successMsg = dataService.initPdf(tableName);

		tables = dataService.selectData();
		return "pdf_locate";
	}
	
	
	
	public String xmlLocate(){	 //  进入	xml标准数据报表  3
		tables = dataService.selectData();
		return "xml_locate";
	}
	
	
	public String initXml(){  // 生成Xml 文件
		 successMsg = dataService.initXml(tableName);
		 
		 tables = dataService.selectData();   
		return "xml_locate";
	}
	
	
	public DataService getDataService() {
		return dataService;
	}

	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}
	public List<Object> getTables() {
		return tables;
	}
	public void setTables(List<Object> tables) {
		this.tables = tables;
	}
	public List<Data> getColumns() {
		return columns;
	}
	public void setColumns(List<Data> columns) {
		this.columns = columns;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	 
	public String getToGoSJsp() {
		return toGoSJsp;
	}
	public void setToGoSJsp(String toGoSJsp) {
		this.toGoSJsp = toGoSJsp;
	}

	public String getSuccessMsg() {
		return successMsg;
	}

	public void setSuccessMsg(String successMsg) {
		this.successMsg = successMsg;
	}
	
	
	
	
	
	
}
