package hr.service.recruit;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import hr.entity.ConfigFileFirstKind;
import hr.entity.ConfigFileSecondKind;
import hr.entity.ConfigFileThirdKind;
import hr.entity.ConfigMajor;
import hr.entity.ConfigMajorKind;
import hr.entity.EngageMajorRelease;
import hr.entity.EngageMajorReleaseExample;
import hr.service.BaseService;

/**
 * 
 * @author Eung-yuong Liu
 *
 */
public class PositionService extends BaseService {

	/**
	 *  查询一级分类种类
	 * @return
	 */
	public List<ConfigFileFirstKind> selectFirsts() {
		return configFileFirstKindMapper.selectByExample(null);
	}
	/**
	 * 查询职位种类
	 * @return
	 */
	public List<ConfigMajorKind> selectMajorKinds() {
		return configMajorKindMapper.selectByExample(null);
	}
	/**
	 * 根据一级菜单的id   查出二级菜单  
	 * @return
	 */
	public List<ConfigFileSecondKind> findSecond() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String firstKindId = request.getParameter("firstKind");
		
		Integer fkId = Integer.valueOf(firstKindId);
		
		if(fkId!=0){
			return  configFileSecondKindMapper.findByFirstId(fkId);
		}else{
			return configFileSecondKindMapper.selectByExample(null);
		}
	}
	/** 
	 * 根据二级查询 三级 ，如果二级是  0  ，就根据一级查询  
	 * @param request
	 * @return
	 */
	public List<ConfigFileThirdKind> findThird(HttpServletRequest request) {
		List<ConfigFileThirdKind> thirds = null;
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
				thirds = configFileThirdKindMapper.findBySecodId(secondKind);
		}
		System.out.println("secondKind: "+request.getParameter("secondKind")+"   firstKindId："+request.getParameter("firstKindId"));
		return thirds;
	}
	
	/**
	 * 根据职位种类查询出所属的职位
	 * @param request
	 * @return
	 */
	public List<ConfigMajor> findMajor(HttpServletRequest request) {
		 List<ConfigMajor> configMajors =null;
		String majorKindIdStr = request.getParameter("majorKindId");
		System.out.println(majorKindIdStr);
		Integer majorKindId = Integer.valueOf(majorKindIdStr);
		if(majorKindId == 0 ){  //为0  就查询全部
			configMajors = configMajorMapper.selectByExample(null);
		}else{
			configMajors = configMajorMapper.findByMajorKindId(majorKindId);
		}
		return configMajors;
	}
	/**
	 *  插入一条  EngageMajorRelease 的数据到数据库中
	 * @param emajorRelease  
	 * @return
	 */
	public int insertEmajorRelease(EngageMajorRelease emajorRelease) {
		return  engageMajorReleaseMapper.insert(emajorRelease);
	}
	/**
	 * 查询书  这个条件有几条数据在数据库中
	 * @return
	 */
	public int geteMajorReleaseCount(EngageMajorReleaseExample example) {
		return  engageMajorReleaseMapper.countByExample(example);
	}
	
	/**
	 *  --职位发布管理--职位发布变更    进入（如果第一次进  就是第一页 ， 一页五行）
	 * @return
	 */
	public List<EngageMajorRelease> geteMajorReleasePage(
			EngageMajorRelease emajorRelease ,Integer page ,Integer rows ) {
		
		if(page==null || page <=0)page=1;
		if(rows==null) rows=5;
		
		System.out.println("============="+engageMajorReleaseMapper);
		int start = (page-1)*rows;
		EngageMajorReleaseExample example = new EngageMajorReleaseExample();
		example.createCriteria();
		example.setLimitStart(start);
		example.setLimitEnd(rows);
		
		return engageMajorReleaseMapper.selectByExample(example);
	}
	/**
	 * 根据id 查询 
	 * @param id
	 * @return
	 */
	public EngageMajorRelease selectEmajorReleaseById(Integer id) {
		return  engageMajorReleaseMapper.selectByPrimaryKey(id);
	}
	/**
	 * 根据id 删除一条 engage_major_release 表的记录 
	 * @param id
	 * @return
	 */
	public int deleteEmajorReleaseById(Integer id) {
		return  engageMajorReleaseMapper.deleteByPrimaryKey(id);
	}
	public void updateEmajorRelease(EngageMajorRelease emajorRelease) {
		engageMajorReleaseMapper.updateByPrimaryKey(emajorRelease);
	}
	

}
