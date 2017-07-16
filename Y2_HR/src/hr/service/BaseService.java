package hr.service;

import hr.mapperdao.BonusMapper;
import hr.mapperdao.ConfigFileFirstKindMapper;
import hr.mapperdao.ConfigFileSecondKindMapper;
import hr.mapperdao.ConfigFileThirdKindMapper;
import hr.mapperdao.ConfigMajorKindMapper;
import hr.mapperdao.ConfigMajorMapper;
import hr.mapperdao.ConfigPrimaryKeyMapper;
import hr.mapperdao.ConfigPublicCharMapper;
import hr.mapperdao.ConfigQuestionFirstKindMapper;
import hr.mapperdao.ConfigQuestionSecondKindMapper;
import hr.mapperdao.DataMapper;
import hr.mapperdao.EngageAnswerDetailsMapper;
import hr.mapperdao.EngageAnswerMapper;
import hr.mapperdao.EngageExamDetailsMapper;
import hr.mapperdao.EngageExamMapper;
import hr.mapperdao.EngageInterviewMapper;
import hr.mapperdao.EngageMajorReleaseMapper;
import hr.mapperdao.EngageResumeMapper;
import hr.mapperdao.EngageSubjectsMapper;
import hr.mapperdao.HumanFileMapper;
import hr.mapperdao.HumanfileDigMapper;
import hr.mapperdao.MajorChangeMapper;
import hr.mapperdao.RightMapper;
import hr.mapperdao.SalaryGrantDetailsMapper;
import hr.mapperdao.SalaryGrantMapper;
import hr.mapperdao.SalaryStandardDetailsMapper;
import hr.mapperdao.SalaryStandardMapper;
import hr.mapperdao.SysRoleMapper;
import hr.mapperdao.SysRoleRightMapper;
import hr.mapperdao.TrainingMapper;
import hr.mapperdao.UserMapper;

public class BaseService {

	protected BonusMapper bonusMapper;
	protected ConfigFileFirstKindMapper configFileFirstKindMapper;
	protected ConfigFileSecondKindMapper configFileSecondKindMapper;
	protected ConfigFileThirdKindMapper configFileThirdKindMapper;
	protected ConfigMajorKindMapper configMajorKindMapper;
	protected ConfigMajorMapper configMajorMapper;
	protected ConfigPrimaryKeyMapper configPrimaryKeyMapper;
	protected ConfigPublicCharMapper configPublicCharMapper;
	protected ConfigQuestionFirstKindMapper configQuestionFirstKindMapper;
	protected ConfigQuestionSecondKindMapper configQuestionSecondKindMapper;
	protected EngageAnswerDetailsMapper engageAnswerDetailsMapper;
	protected EngageAnswerMapper engageAnswerMapper;
	protected EngageExamDetailsMapper engageExamDetailsMapper;
	protected EngageExamMapper engageExamMapper;
	protected EngageInterviewMapper engageInterviewMapper;
	protected EngageMajorReleaseMapper engageMajorReleaseMapper;
	protected EngageResumeMapper engageResumeMapper;
	protected EngageSubjectsMapper engageSubjectsMapper;
	protected HumanfileDigMapper humanfileDigMapper;
	protected HumanFileMapper humanFileMapper;
	protected MajorChangeMapper majorChangeMapper;
	protected RightMapper rightMapper;
	protected SalaryGrantDetailsMapper salaryGrantDetailsMapper;
	protected SalaryGrantMapper salaryGrantMapper;
	protected SalaryStandardDetailsMapper salaryStandardDetailsMapper;
	protected SalaryStandardMapper salaryStandardMapper;
	protected TrainingMapper trainingMapper;
	protected UserMapper userMapper;
	
	protected SysRoleMapper sysRoleMapper;
	protected SysRoleRightMapper sysRoleRightMapper;
	
	protected DataMapper dataMapper;
	
	public void setBonusMapper(BonusMapper bonusMapper) {
		this.bonusMapper = bonusMapper;
	}
	public void setConfigFileFirstKindMapper(
			ConfigFileFirstKindMapper configFileFirstKindMapper) {
		this.configFileFirstKindMapper = configFileFirstKindMapper;
	}
	public void setConfigFileSecondKindMapper(
			ConfigFileSecondKindMapper configFileSecondKindMapper) {
		this.configFileSecondKindMapper = configFileSecondKindMapper;
	}
	public void setConfigFileThirdKindMapper(
			ConfigFileThirdKindMapper configFileThirdKindMapper) {
		this.configFileThirdKindMapper = configFileThirdKindMapper;
	}
	public void setConfigMajorKindMapper(ConfigMajorKindMapper configMajorKindMapper) {
		this.configMajorKindMapper = configMajorKindMapper;
	}
	public void setConfigMajorMapper(ConfigMajorMapper configMajorMapper) {
		this.configMajorMapper = configMajorMapper;
	}
	public void setConfigPrimaryKeyMapper(
			ConfigPrimaryKeyMapper configPrimaryKeyMapper) {
		this.configPrimaryKeyMapper = configPrimaryKeyMapper;
	}
	public void setConfigPublicCharMapper(
			ConfigPublicCharMapper configPublicCharMapper) {
		this.configPublicCharMapper = configPublicCharMapper;
	}
	public void setConfigQuestionFirstKindMapper(
			ConfigQuestionFirstKindMapper configQuestionFirstKindMapper) {
		this.configQuestionFirstKindMapper = configQuestionFirstKindMapper;
	}
	public void setConfigQuestionSecondKindMapper(
			ConfigQuestionSecondKindMapper configQuestionSecondKindMapper) {
		this.configQuestionSecondKindMapper = configQuestionSecondKindMapper;
	}
	public void setEngageAnswerDetailsMapper(
			EngageAnswerDetailsMapper engageAnswerDetailsMapper) {
		this.engageAnswerDetailsMapper = engageAnswerDetailsMapper;
	}
	public void setEngageAnswerMapper(EngageAnswerMapper engageAnswerMapper) {
		this.engageAnswerMapper = engageAnswerMapper;
	}
	public void setEngageExamDetailsMapper(
			EngageExamDetailsMapper engageExamDetailsMapper) {
		this.engageExamDetailsMapper = engageExamDetailsMapper;
	}
	public void setEngageExamMapper(EngageExamMapper engageExamMapper) {
		this.engageExamMapper = engageExamMapper;
	}
	public void setEngageInterviewMapper(EngageInterviewMapper engageInterviewMapper) {
		this.engageInterviewMapper = engageInterviewMapper;
	}
	public void setEngageMajorReleaseMapper(
			EngageMajorReleaseMapper engageMajorReleaseMapper) {
		this.engageMajorReleaseMapper = engageMajorReleaseMapper;
	}
	public void setEngageResumeMapper(EngageResumeMapper engageResumeMapper) {
		this.engageResumeMapper = engageResumeMapper;
	}
	public void setEngageSubjectsMapper(EngageSubjectsMapper engageSubjectsMapper) {
		this.engageSubjectsMapper = engageSubjectsMapper;
	}
 
	public void setHumanfileDigMapper(HumanfileDigMapper humanfileDigMapper) {
		this.humanfileDigMapper = humanfileDigMapper;
	}
	public void setHumanFileMapper(HumanFileMapper humanFileMapper) {
		this.humanFileMapper = humanFileMapper;
	}
 
	public void setMajorChangeMapper(MajorChangeMapper majorChangeMapper) {
		this.majorChangeMapper = majorChangeMapper;
	}
 
	public void setRightMapper(RightMapper rightMapper) {
		this.rightMapper = rightMapper;
	}
	public void setSalaryGrantDetailsMapper(
			SalaryGrantDetailsMapper salaryGrantDetailsMapper) {
		this.salaryGrantDetailsMapper = salaryGrantDetailsMapper;
	}
	public void setSalaryGrantMapper(SalaryGrantMapper salaryGrantMapper) {
		this.salaryGrantMapper = salaryGrantMapper;
	}
	public void setSalaryStandardDetailsMapper(
			SalaryStandardDetailsMapper salaryStandardDetailsMapper) {
		this.salaryStandardDetailsMapper = salaryStandardDetailsMapper;
	}
	public void setSalaryStandardMapper(SalaryStandardMapper salaryStandardMapper) {
		this.salaryStandardMapper = salaryStandardMapper;
	}
	public void setTrainingMapper(TrainingMapper trainingMapper) {
		this.trainingMapper = trainingMapper;
	}
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	public void setSysRoleMapper(SysRoleMapper sysRoleMapper) {
		this.sysRoleMapper = sysRoleMapper;
	}
	public void setSysRoleRightMapper(SysRoleRightMapper sysRoleRightMapper) {
		this.sysRoleRightMapper = sysRoleRightMapper;
	}
	public void setDataMapper(DataMapper dataMapper) {
		this.dataMapper = dataMapper;
	}
	
}
