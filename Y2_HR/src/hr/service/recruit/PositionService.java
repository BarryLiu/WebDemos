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
	 *  ��ѯһ����������
	 * @return
	 */
	public List<ConfigFileFirstKind> selectFirsts() {
		return configFileFirstKindMapper.selectByExample(null);
	}
	/**
	 * ��ѯְλ����
	 * @return
	 */
	public List<ConfigMajorKind> selectMajorKinds() {
		return configMajorKindMapper.selectByExample(null);
	}
	/**
	 * ����һ���˵���id   ��������˵�  
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
	 * ���ݶ�����ѯ ���� �����������  0  ���͸���һ����ѯ  
	 * @param request
	 * @return
	 */
	public List<ConfigFileThirdKind> findThird(HttpServletRequest request) {
		List<ConfigFileThirdKind> thirds = null;
		Integer secondKind = Integer.valueOf(request.getParameter("secondKind"));
		if (secondKind == 0) {// ��� secondKind ==0 ���� ��������ѡ����� ȫ�� ��
								// �����firstKindId ����ѯ
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
		System.out.println("secondKind: "+request.getParameter("secondKind")+"   firstKindId��"+request.getParameter("firstKindId"));
		return thirds;
	}
	
	/**
	 * ����ְλ�����ѯ��������ְλ
	 * @param request
	 * @return
	 */
	public List<ConfigMajor> findMajor(HttpServletRequest request) {
		 List<ConfigMajor> configMajors =null;
		String majorKindIdStr = request.getParameter("majorKindId");
		System.out.println(majorKindIdStr);
		Integer majorKindId = Integer.valueOf(majorKindIdStr);
		if(majorKindId == 0 ){  //Ϊ0  �Ͳ�ѯȫ��
			configMajors = configMajorMapper.selectByExample(null);
		}else{
			configMajors = configMajorMapper.findByMajorKindId(majorKindId);
		}
		return configMajors;
	}
	/**
	 *  ����һ��  EngageMajorRelease �����ݵ����ݿ���
	 * @param emajorRelease  
	 * @return
	 */
	public int insertEmajorRelease(EngageMajorRelease emajorRelease) {
		return  engageMajorReleaseMapper.insert(emajorRelease);
	}
	/**
	 * ��ѯ��  ��������м������������ݿ���
	 * @return
	 */
	public int geteMajorReleaseCount(EngageMajorReleaseExample example) {
		return  engageMajorReleaseMapper.countByExample(example);
	}
	
	/**
	 *  --ְλ��������--ְλ�������    ���루�����һ�ν�  ���ǵ�һҳ �� һҳ���У�
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
	 * ����id ��ѯ 
	 * @param id
	 * @return
	 */
	public EngageMajorRelease selectEmajorReleaseById(Integer id) {
		return  engageMajorReleaseMapper.selectByPrimaryKey(id);
	}
	/**
	 * ����id ɾ��һ�� engage_major_release ��ļ�¼ 
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
