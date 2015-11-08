package hr.action.salaryGrant;

import java.util.List;

import hr.service.salaryGrant.GrantService;

public class GrantAction {
	private GrantService grantService;
	private List<Object> lists;
	private Integer personCount;

	
//н�귢��  ==========================1
	public  String registerLocate(){
		System.out.println("������н�귢�š�����");
		
		return "register_locate";
	}
	public String registerList(){  // ����н�귢�ŵ�list ҳ��
		 lists = grantService.selectList();
System.out.println("============");
		 for (Object object : lists) {
			System.out.println(object);
		}
		 return "register_list";
	}
	
	
	
	
	public String checkList(){
		
		
		return "check_list";
	}
	public String queryList(){
		
		
		return "query_list";
	}
	
	
	
	public GrantService getGrantService() {
		return grantService;
	}

	public void setGrantService(GrantService grantService) {
		this.grantService = grantService;
	}
	public List<Object> getLists() {
		return lists;
	}
	public void setLists(List<Object> lists) {
		this.lists = lists;
	}
	
}
