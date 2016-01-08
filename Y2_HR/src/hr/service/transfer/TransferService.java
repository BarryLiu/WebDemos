package hr.service.transfer;

import hr.entity.ConfigFileFirstKind;
import hr.entity.ConfigFileSecondKind;
import hr.entity.ConfigFileThirdKind;
import hr.entity.ConfigMajor;
import hr.entity.ConfigMajorKind;
import hr.entity.HumanFile;
import hr.entity.MajorChange;
import hr.entity.SalaryStandardDetails;
import hr.service.BaseService;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

public class TransferService extends BaseService{

	public List<ConfigFileFirstKind> selectAllFirsts() {
		return configFileFirstKindMapper.selectByExample(null);
	}

	public List<ConfigFileSecondKind> selectSecondsByFirstId(Integer fkId) {
		return configFileSecondKindMapper.findByFirstId(fkId);
	}

	public List<ConfigFileSecondKind> selectByExample() {
		return  configFileSecondKindMapper.selectByExample(null);
	}

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

	public Map<String, Object> selectProfile(HumanFile humanFile, int page,
			int rows,Date dd1,Date dd2) {
		int start = (page - 1) * rows;
	 	List<HumanFile> humanFiles = humanFileMapper.selectAll2(humanFile,start,rows,dd1,dd2);
		Map<String, Object> data = new HashMap<String, Object>();
		int total = humanFileMapper.count1(humanFile,dd1,dd2);
		data.put("total", total);
		data.put("rows", humanFiles);
		return data; 
	}


	public HumanFile selectHumanById(int id) {
		HumanFile humanFile = humanFileMapper.selectByPrimaryKey(id);
		return humanFile;
	}

	public List<ConfigMajorKind> selectAllMajorKinds() {
		return configMajorKindMapper.selectByExample(null);
	}

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

	public List<SalaryStandardDetails> selectAllSalaryStandards() {
		return salaryStandardDetailsMapper.selectByExample(null);
	}
	
	public List<ConfigMajor> find() {
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

	public List<SalaryStandardDetails> findsalarys() {
		HttpServletRequest request =ServletActionContext.getRequest();
		String salaryStandard = request.getParameter("salaryStandardId");
		List<SalaryStandardDetails> salarys =null;
		Integer salaryStandardId = Integer.valueOf(salaryStandard);
		if(salaryStandardId == 0 ){  //为0  就查询全部
			 salarys = salaryStandardDetailsMapper.selectByExample(null);
		}else{
 			 salarys = salaryStandardDetailsMapper.findBySalaryStandardId(salaryStandardId);
		}
		return  salarys;
	}

	public int insertMajorChange(MajorChange majorchange) {
		int insert = majorChangeMapper.insert(majorchange);
		return insert;
	}

	public Map<String, Object> selectMajorChange(int page, int rows) {
		int start = (page - 1) * rows;
 		List<MajorChange> majorChanges=majorChangeMapper.selectByCheck(start,rows);
		Map<String, Object> data = new HashMap<String, Object>();
		int total = majorChangeMapper.count1();
		data.put("total", total);
		data.put("rows", majorChanges);
		return data; 
	}

	public MajorChange selectById(int id) {
		return majorChangeMapper.selectByPrimaryKey(id);
	}

	public int updateMajorChange(MajorChange majorChange) {
		System.out.println(majorChange.getId());
		System.out.println(majorChange.getCheckStatus());
		return majorChangeMapper.updateByPrimaryKey(majorChange);
	}

	public Map<String, Object> selectMajorChange2(MajorChange majorChange,
			int page, int rows,Date dd1,Date dd2) {
		int start = (page - 1) * rows;
		if(start<=0)start = 0;
	 	List<MajorChange> majorChanges = majorChangeMapper.selectAll(majorChange,start,rows,dd1,dd2);
		Map<String, Object> data = new HashMap<String, Object>();
		int total = majorChangeMapper.count2(majorChange,dd1,dd2);
		data.put("total", total);
		data.put("rows", majorChanges);
		return data; 
	}

}
