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
	
	/**��ѡ��ı�ı��ʱ��ͽ��� ��ѯ�µı����*/
	public String loadCloumns(){
		tables = dataService.selectData();
		columns= dataService.selectParams(tableName);
		return toGoSJsp;
	}
 
	public String excelLocate(){ // ����	Excel��׼���ݱ���  1
		
		tables = dataService.selectData();
		return "excel_locate";
	}
	public String initExcel() throws RowsExceededException, WriteException, IOException{  // ����excel �ļ�
		 successMsg = dataService.initExcel(tableName);
		
		 tables = dataService.selectData();
		 return "excel_locate";
	}
	
	
	
	public String pdfLocate(){   //  ����	Pdf��׼���ݱ���  2
		tables = dataService.selectData();
		return "pdf_locate";
	}
	
	
	public String initPdf(){  // ����Pdf �ļ�
		successMsg = dataService.initPdf(tableName);

		tables = dataService.selectData();
		return "pdf_locate";
	}
	
	
	
	public String xmlLocate(){	 //  ����	xml��׼���ݱ���  3
		tables = dataService.selectData();
		return "xml_locate";
	}
	
	
	public String initXml(){  // ����Xml �ļ�
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
