package hr.action.power;

import hr.dto.Node;
import hr.entity.User;
import hr.service.power.UrrService;
import hr.utils.HrUtils;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;

public class UrrAction {

	private UrrService urrService;
	 
	public void setUrrService(UrrService urrService) {
		this.urrService = urrService;
	}
	public UrrService getUrrService() {
		return urrService;
	}

	private HttpServletResponse response;

	// struts Ҫ���ݵ����� 
	private Integer id;
	private User user;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * ������ߵ�    
	 * @return
	 * @throws IOException
	 */
	public String initMenu() throws IOException {
		
		if(id==null)id=0;
		
		List<Node> nodes = urrService.initMenu(id);
		//List<Node> nodes = urrService.selectCurrUserRight(id);
	
		
		String jsonStr = new Gson().toJson(nodes);
		HrUtils.sendClient(jsonStr);

		return null;
	}
	 

	/**
	 * ��½ �����½�ɹ��ͷ��� success ʧ�ܼ����� fail  
	 * @return
	 * @throws IOException
	 */
	public String login() throws IOException {
		
		
		String jsonStr =urrService.login(user);
		
		response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write(jsonStr);
		return null;
	}

}
