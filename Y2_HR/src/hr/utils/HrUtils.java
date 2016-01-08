package hr.utils;

import hr.dto.Node;
import hr.entity.ConfigPrimaryKey;
import hr.entity.Right;
import hr.mapperdao.ConfigPrimaryKeyMapper;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

public class HrUtils {
	/**
	 * ��List<Right> rights ���͵�����ת����  List<Node> �����ݷ���ȥ �� ���ڼ�����ߵ�tree 
	 * @param rights
	 * @return
	 */
	public static List<Node> ConvertChildren(List<Right> rights) {
		List<Node> nodes = new ArrayList<Node>();

		for (Right right : rights) {
			Node node = new Node();

			node.setId(right.getId());
			node.setText(right.getRightName());
			node.setPath(right.getRightPath());
			
			if ("Folder".equalsIgnoreCase(right.getRightType())){  // �ж�����ڵ��Ǹ��ڵ�   ���Ҳ������Ľڵ�ʹ�
				node.setState("closed");
			}
			nodes.add(node);
		}
		return nodes;
	}
	
	/**
	 * ��Ҫ  ���͵�json �ַ������͵������ȥ   
	 * @param jsonStr  json �ַ���
	 * @throws IOException  
	 */
	public static void sendClient(String jsonStr) throws IOException {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		response.getWriter().write(jsonStr);
	}
	/**
	 * ��ӡ�������ύ������   
	 */
	public static void showParams() {
		HttpServletRequest request = ServletActionContext.getRequest();
		Map<String, String[]> map = request.getParameterMap();
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key + ":" + Arrays.toString(map.get(key)));
		}
	}
	/**
	 * ���ڹؼ��ֲ�ѯ  �ò����������� �������͹ؼ���
	 * @param utilBean
	 * @return
	 */
	public static String getWhereStr(ConfigPrimaryKeyMapper configPrimaryKeyMapper,UtilBean utilBean) {
		String primaryKey =utilBean.getPrimarKey();
		StringBuffer whereStr=null;
		if(primaryKey!=null && !"".equals(primaryKey)){
			List<ConfigPrimaryKey> keys=configPrimaryKeyMapper.selectPrimaryKey(utilBean.getDatePropertyName());
			whereStr=new StringBuffer(" and");
			for (ConfigPrimaryKey key : keys) {
				whereStr.append(" resume."+key.getPrimaryKey()+" like '%"+primaryKey+"%' or");
			}
		}
		if(whereStr==null)
			return null;
		return whereStr.substring(0, whereStr.length()-2); //  and  xxx  like s or yyy like s or .....
	}
	public static Date addDateParam(String paramName) throws ParseException {
		String param =ServletActionContext.getRequest().getParameter(paramName);
		Date date=null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		date = sdf.parse(param);
		return date;
	}
}
