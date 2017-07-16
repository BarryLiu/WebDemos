package hr.service.client;

import java.util.List;

import hr.entity.ConfigFileFirstKind;
import hr.entity.ConfigFileSecondKind;
import hr.entity.ConfigFileThirdKind;
import hr.entity.ConfigMajor;
import hr.entity.ConfigMajorKind;
import hr.entity.ConfigPrimaryKey;
import hr.entity.ConfigPublicChar;
import hr.entity.Data;
import hr.entity.SalaryStandardDetails;
import hr.service.BaseService;

public class ClientService extends BaseService{

	public List<ConfigFileFirstKind> selectAllFirsts() {
		return configFileFirstKindMapper.selectByExample(null);
	}

	public int deleteFirst(int id) {
		return configFileFirstKindMapper.deleteByPrimaryKey(id);
	}

	public int insertFirst(ConfigFileFirstKind first) {
		return configFileFirstKindMapper.insert(first);
	}

	public ConfigFileFirstKind findFirstById(Integer id) {
		return configFileFirstKindMapper.selectByPrimaryKey(id);
	}

	public int updateFirst(ConfigFileFirstKind first) {
		return configFileFirstKindMapper.updateByPrimaryKey(first);
	}

	public List<ConfigFileSecondKind> selectAllSeconds() {
		return configFileSecondKindMapper.selectByExample(null);
	}

	public int deleteSecond(Integer id) {
		return configFileSecondKindMapper.deleteByPrimaryKey(id);
	}

	public int insertSecond(ConfigFileSecondKind second) {
		return configFileSecondKindMapper.insert(second);
	}

	public ConfigFileSecondKind findSecondById(Integer id) {

		return configFileSecondKindMapper.selectByPrimaryKey(id);
	}

	public int updateSecond(ConfigFileSecondKind second) {
		return configFileSecondKindMapper.updateByPrimaryKey(second);
	}

	public List<ConfigFileThirdKind> selectAllThirds() {
		return configFileThirdKindMapper.selectByExample(null);
	}

	public int deleteThird(Integer id) {
		return configFileThirdKindMapper.deleteByPrimaryKey(id);
	}

	public List<ConfigFileSecondKind> selectSecondsByFirstId(Integer fkId) {
		 return configFileSecondKindMapper.findByFirstId(fkId);
	}

	public int insertThird(ConfigFileThirdKind third) {
		return configFileThirdKindMapper.insert(third);
	}

	public ConfigFileThirdKind findThirdById(Integer id) {
		return configFileThirdKindMapper.selectByPrimaryKey(id);
	}

	public int updateThird(ConfigFileThirdKind third) {
		return configFileThirdKindMapper.updateByPrimaryKey(third);
	}

	public List<ConfigMajorKind> selectAllMajorKinds() {
		return configMajorKindMapper.selectByExample(null);
	}

	public int deleteMajorKind(Integer id) {
		return configMajorKindMapper.deleteByPrimaryKey(id);
	}

	public int insertMajorKind(ConfigMajorKind majorkind) {
		return configMajorKindMapper.insert(majorkind);
	}

	public List<ConfigMajor> selectAllMajors() {
		return configMajorMapper.selectByExample(null);
	}

	public int deleteMajor(Integer id) {
		return configMajorMapper.deleteByPrimaryKey(id);
	}

	public int insertMajor(ConfigMajor major) {
		return configMajorMapper.insert(major);
	}

	public List<ConfigPublicChar> selectAllPbcs() {
		return configPublicCharMapper.selectByExample(null);
	}

	public int deletePbc(Integer id) {
		return configPublicCharMapper.deleteByPrimaryKey(id);
	}

	public int insertPbc(ConfigPublicChar pbc) {
		return configPublicCharMapper.insert(pbc);
	}

	public List<SalaryStandardDetails> selectAllSsds() {
		return salaryStandardDetailsMapper.selectByExample(null);
	}

	public int deleteSsd(Integer id) {
		return salaryStandardDetailsMapper.deleteByPrimaryKey(id);
	}

	public int insertSsd(SalaryStandardDetails ssd) {
		return salaryStandardDetailsMapper.insert(ssd);
	}

	public List<ConfigPublicChar> selectPbcs2() {
		return configPublicCharMapper.selectByName();
	}

	public List<Object> selectAllTables() {
		List<Object> tables = dataMapper.selectTables();
		return tables;
	}

	public List<Data> selectColumens(String tableName) {
		List<Data> datas=dataMapper.selectByTableName(tableName);
		return datas;
	}

	public ConfigPrimaryKey selectBycolumnName(String string) {
		return configPrimaryKeyMapper.selectBycolumnComment(string);
	}

	public int insertCpk(ConfigPrimaryKey cpk2) {
		return configPrimaryKeyMapper.insert(cpk2);
	}

	public int updatePbc(ConfigPublicChar pbc) {
		return configPublicCharMapper.updateByPrimaryKey(pbc);
	}


}
