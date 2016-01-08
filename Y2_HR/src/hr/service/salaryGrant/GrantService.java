package hr.service.salaryGrant;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import hr.entity.ConfigFileFirstKind;
import hr.entity.ConfigFileSecondKind;
import hr.entity.ConfigFileThirdKind;
import hr.service.BaseService;

public class GrantService extends BaseService {

	/**将查询到的数据都放到list 的object 的对象中去*/
	public List<Object> selectList() { // 
		List<Object> lists= new ArrayList<Object>();
		String submitType = ServletActionContext.getRequest().getParameter(
				"submitType");
		if(submitType.equals("1")){
			List<ConfigFileFirstKind> firsts = configFileFirstKindMapper.selectByExample(null);
			lists.add(firsts);
		}else if(submitType.equals("2")){
			List<ConfigFileSecondKind> seconds = configFileSecondKindMapper.selectByExample(null);
			lists.add(seconds);
		}else if(submitType.equals("3")){
			List<ConfigFileThirdKind> thirds = configFileThirdKindMapper.selectByExample(null);
			lists.add(thirds);
		}

		return lists;
	}

}
