package hr.service.profile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import hr.entity.ConfigFileFirstKind;
import hr.entity.ConfigFileSecondKind;
import hr.entity.ConfigFileThirdKind;
import hr.entity.ConfigMajor;
import hr.entity.ConfigMajorKind;
import hr.entity.HumanFile;
import hr.service.BaseService;
import hr.utils.UtilBean;

public class ProfileService extends BaseService{

	/**
	 *  查询所有的  一级菜单
	 * @return
	 */
	public List<ConfigFileFirstKind> selectAllFirsts() {
		return configFileFirstKindMapper.selectByExample(null);
	}
	
	/**
	 * 查询所有的职位分类
	 * @return
	 */
	public List<ConfigMajorKind> selectAllMajorKinds() {
		return configMajorKindMapper.selectByExample(null);
	}
	/**
	 *  根据一级菜单的id 查询出属于他的二级菜单
	 * @param fkId
	 * @return
	 */
	public List<ConfigFileSecondKind> selectSecondsByFirstId(Integer fkId) {
		return configFileSecondKindMapper.findByFirstId(fkId);
	}
	/**
	 * 查询出所有的二级菜单
	 * @return
	 */
	public List<ConfigFileSecondKind> selectByExample() {
		return  configFileSecondKindMapper.selectByExample(null);
	}
	
	/**
	 * 根据二级菜单的id 查出三级菜单   
	 * 如果二级菜单的id 为0   就根据一级菜单查询 
	 * ， 如果一级菜单的也是0 就查询全部的 三级菜单
	 * @param request
	 * @return
	 */
	public List<ConfigFileThirdKind> findThird(HttpServletRequest request) {
		List<ConfigFileThirdKind> thirds =null;
		
		Integer secondKind = Integer.valueOf(request.getParameter("secondKind"));
		if (secondKind == 0) {// 如果 secondKind ==0 就是 二级机构选择的是 全部 ，
								// 则根据firstKindId 来查询
			String firstKindIdStr = request.getParameter("firstKindId");
			
			if(firstKindIdStr==null || "0".equals(firstKindIdStr)||"".equals(firstKindIdStr)){
				thirds = configFileThirdKindMapper.selectByExample(null);
			}else{
				Integer firstKindId =Integer.valueOf(firstKindIdStr);
				thirds = configFileThirdKindMapper.findByFirstId(firstKindId);
			}
		} else {
			if(secondKind==null || secondKind ==0){
				thirds = configFileThirdKindMapper.selectByExample(null);
			}else{
				thirds = configFileThirdKindMapper.findBySecodId(secondKind);
			}
		}
		return thirds;
	}
	
	/**
	 * 根据 职位类型id 查询出 职位  如果职位id 为0 就查询全部     的职位
	 * @return
	 */
	public List<ConfigMajor> findMajor() {
		HttpServletRequest request =ServletActionContext.getRequest();
		String majorKindIdStr = request.getParameter("majorKindId");
		List<ConfigMajor> configMajors =null;
		Integer majorKindId = Integer.valueOf(majorKindIdStr);
		if(majorKindId == 0 ){  //为0  就查询全部
			configMajors = configMajorMapper.selectByExample(null);
		}else{
			configMajors = configMajorMapper.findByMajorKindId(majorKindId);
		}
		
		return configMajors;
	}
	
	/**
	 * 根据    一二三四五 级菜单查询出humanFile 的对象并将他们 分页， 
	 *  如果 没选就 忽略
	 * @param humanFile
	 * @param page
	 * @param rows
	 * @return
	 */
	public Map<String, Object> selectProfile(HumanFile humanFile, int page,
			int rows) {
		if( page <=0)page=1;
		
		int start = (page - 1) * rows;
		List<HumanFile> humanFiles = humanFileMapper.selectAll(humanFile,start,rows);
		 
		System.out.println("humanFiles.size() :  "+humanFiles.size());
		
		Map<String, Object> data = new HashMap<String, Object>();

		int total = humanFileMapper.count(humanFile);
		data.put("total", total);
		data.put("rows", humanFiles);
		
		return data;
	}

	public Map<String, Object> selectProfileTag(HumanFile humanFile,UtilBean utilBean, int page,
			int rows) {
		if( page <=0)page=1;
		if(rows ==0) rows =5;
		if(humanFile==null) humanFile = new HumanFile();
		String queryTag = ServletActionContext.getRequest().getParameter("queryTag");
		List<HumanFile> humanFiles = humanFileMapper.selectAllByTag(humanFile,utilBean,queryTag,(page - 1) * rows,rows);
		System.out.println("humanFiles.size() :  "+humanFiles.size());
		Map<String, Object> data = new HashMap<String, Object>();

		int total = humanFileMapper.count(humanFile);
		data.put("total", total);
		data.put("rows", humanFiles);
		
		return data;
	}

	public int selectCount() {
		return humanFileMapper.countByExample(null);
	}

	public HumanFile selectHumanFile(Integer id) {
		return humanFileMapper.selectByPrimaryKey(id);
	}
	
}
