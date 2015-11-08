package hr.mapperdao;

import hr.entity.ConfigFileThirdKind;
import hr.entity.ConfigFileThirdKindExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ConfigFileThirdKindMapper {
    int countByExample(ConfigFileThirdKindExample example);

    int deleteByExample(ConfigFileThirdKindExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfigFileThirdKind record);

    int insertSelective(ConfigFileThirdKind record);

    List<ConfigFileThirdKind> selectByExample(ConfigFileThirdKindExample example);

    ConfigFileThirdKind selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfigFileThirdKind record, @Param("example") ConfigFileThirdKindExample example);

    int updateByExample(@Param("record") ConfigFileThirdKind record, @Param("example") ConfigFileThirdKindExample example);

    int updateByPrimaryKeySelective(ConfigFileThirdKind record);

    int updateByPrimaryKey(ConfigFileThirdKind record);

    
    
//   自定义 查询语句    
	List<ConfigFileThirdKind> findByFirstId(Integer firstKindId);

	List<ConfigFileThirdKind> findBySecodId(Integer secondKind);
}