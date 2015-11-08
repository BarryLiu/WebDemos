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
	 *  ��ѯ���е�  һ���˵�
	 * @return
	 */
	public List<ConfigFileFirstKind> selectAllFirsts() {
		return configFileFirstKindMapper.selectByExample(null);
	}
	
	/**
	 * ��ѯ���е�ְλ����
	 * @return
	 */
	public List<ConfigMajorKind> selectAllMajorKinds() {
		return configMajorKindMapper.selectByExample(null);
	}
	/**
	 *  ����һ���˵���id ��ѯ���������Ķ����˵�
	 * @param fkId
	 * @return
	 */
	public List<ConfigFileSecondKind> selectSecondsByFirstId(Integer fkId) {
		return configFileSecondKindMapper.findByFirstId(fkId);
	}
	/**
	 * ��ѯ�����еĶ����˵�
	 * @return
	 */
	public List<ConfigFileSecondKind> selectByExample() {
		return  configFileSecondKindMapper.selectByExample(null);
	}
	
	/**
	 * ���ݶ����˵���id ��������˵�   
	 * ��������˵���id Ϊ0   �͸���һ���˵���ѯ 
	 * �� ���һ���˵���Ҳ��0 �Ͳ�ѯȫ���� �����˵�
	 * @param request
	 * @return
	 */
	public List<ConfigFileThirdKind> findThird(HttpServletRequest request) {
		List<ConfigFileThirdKind> thirds =null;
		
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
			if(secondKind==null || secondKind ==0){
				thirds = configFileThirdKindMapper.selectByExample(null);
			}else{
				thirds = configFileThirdKindMapper.findBySecodId(secondKind);
			}
		}
		return thirds;
	}
	
	/**
	 * ���� ְλ����id ��ѯ�� ְλ  ���ְλid Ϊ0 �Ͳ�ѯȫ��     ��ְλ
	 * @return
	 */
	public List<ConfigMajor> findMajor() {
		HttpServletRequest request =ServletActionContext.getRequest();
		String majorKindIdStr = request.getParameter("majorKindId");
		List<ConfigMajor> configMajors =null;
		Integer majorKindId = Integer.valueOf(majorKindIdStr);
		if(majorKindId == 0 ){  //Ϊ0  �Ͳ�ѯȫ��
			configMajors = configMajorMapper.selectByExample(null);
		}else{
			configMajors = configMajorMapper.findByMajorKindId(majorKindId);
		}
		
		return configMajors;
	}
	
	/**
	 * ����    һ�������� ���˵���ѯ��humanFile �Ķ��󲢽����� ��ҳ�� 
	 *  ��� ûѡ�� ����
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
