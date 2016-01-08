package hr.action.salaryGrant;

import java.util.List;

import hr.service.salaryGrant.GrantService;

public class GrantAction {
	private GrantService grantService;
	private List<Object> lists;
	private Integer personCount;

	
//薪酬发放  ==========================1
	public  String registerLocate(){
		System.out.println("来到了薪酬发放。。。");
		
		return "register_locate";
	}
	public String registerList(){  // 跳到薪酬发放的list 页面
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
