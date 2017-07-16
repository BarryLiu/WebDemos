package test.recruit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hr.entity.ConfigFileSecondKind;
import hr.entity.ConfigFileSecondKindExample;
import hr.entity.ConfigPrimaryKey;
import hr.entity.EngageMajorRelease;
import hr.entity.EngageMajorReleaseExample;
import hr.entity.EngageResume;
import hr.mapperdao.ConfigFileSecondKindMapper;
import hr.mapperdao.ConfigPrimaryKeyMapper;
import hr.mapperdao.EngageMajorReleaseMapper;
import hr.mapperdao.EngageResumeMapper;
import hr.utils.HrUtils;
import hr.utils.UtilBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext cxt = null;

	public static void main(String[] args) {
		cxt = new ClassPathXmlApplicationContext(
				"spring/applicationContext-*.xml");

//		testSelectByExamPle();
//		testSelectByExamPle2();
		//testEnageResumeCount();
		//		testEnageResumeSelectAll();
		//testConfigPramaryKey();
		
		test();
	}

	private static void test() {
		String str1="ss";
		str1=null+str1;
		System.out.println(str1);
	}

	private static void testConfigPramaryKey() {
		ConfigPrimaryKeyMapper configPrimaryKeyMapper =  (ConfigPrimaryKeyMapper) cxt.getBean("configPrimaryKeyMapper");
		System.out.println(configPrimaryKeyMapper);	
		UtilBean utilBean = new UtilBean();
		utilBean.setDatePropertyName("engage_resume");
		utilBean.setPrimarKey("");
		utilBean.setEndDate("2015-10-30");
		utilBean.setStartDate("2015-10-1");
		
		String whereStr = HrUtils.getWhereStr(configPrimaryKeyMapper,utilBean);
		System.out.println(whereStr);
		
		EngageResume engageResume = new EngageResume();
		
		EngageResumeMapper engageResumeMapper = (EngageResumeMapper) cxt.getBean("engageResumeMapper");
		List<EngageResume> lists = engageResumeMapper.selectAll(engageResume, utilBean, whereStr, 0, 5);
		
		System.out.println(lists.size());
		for (EngageResume resume : lists) {
			System.out.println("Êý¾Ý£º+"+resume);
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void testEnageResumeSelectAll() {
		EngageResumeMapper mapper =  (EngageResumeMapper) cxt.getBean("engageResumeMapper");
		System.out.println(mapper);		
		int start = 1, rows = 3;
		EngageResume engage = new EngageResume();
		engage.setHumanMajorId("01");
//		engage.setHumanMajorKindId("");
		
//		List<EngageResume> lists = mapper.selectAll( engage,new UtilBean(), start, rows);
//		for (EngageResume engageResume : lists) {
//			System.out.println(engageResume);
//		}
	}

	private static void testEnageResumeCount() {
		EngageResumeMapper mapper =  (EngageResumeMapper) cxt.getBean("engageResumeMapper");
		System.out.println(mapper);
		EngageResume engage = new EngageResume();
		engage.setHumanMajorId("1");
//		engage.setHumanMajorKindId("");
		int count = mapper.count(engage, new UtilBean(), "and 1=1");
		System.out.println(count);
	}

	private static void testSelectByExamPle2() {
		ConfigFileSecondKindMapper mapper =  (ConfigFileSecondKindMapper) cxt.getBean("configFileSecondKindMapper");
		ConfigFileSecondKindExample example = new ConfigFileSecondKindExample();
		
		int page=1;
		int rows=5;
		
		int start = (page-1)*rows;
		example.setLimitStart(start);
		example.setLimitEnd(rows);
		hr.entity.ConfigFileSecondKindExample.Criteria criteria = example.createCriteria();
		
		System.out.println();
		List<ConfigFileSecondKind> lists = mapper.selectByExample(example);
		for (ConfigFileSecondKind kind : lists) {
			System.out.println(kind);
		}
	}

	private static void testSelectByExamPle() {
		EngageMajorReleaseMapper mapper =(EngageMajorReleaseMapper) cxt.getBean("engageMajorReleaseMapper");
		System.out.println("mapper:   "+mapper);
		EngageMajorReleaseExample example =new EngageMajorReleaseExample();
		example.setLimitStart(0);
		example.setLimitEnd(5);
		List<EngageMajorRelease> lists = mapper.selectByExample(example);
		System.out.println(lists.size());
		for (EngageMajorRelease release : lists) {
			System.out.println(release);
		}
		
	}
	
	 
}
