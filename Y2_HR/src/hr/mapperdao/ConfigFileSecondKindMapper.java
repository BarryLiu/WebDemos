package hr.mapperdao;

import hr.entity.ConfigFileSecondKind;
import hr.entity.ConfigFileSecondKindExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ConfigFileSecondKindMapper {
    int countByExample(ConfigFileSecondKindExample example);

    int deleteByExample(ConfigFileSecondKindExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfigFileSecondKind record);

    int insertSelective(ConfigFileSecondKind record);

    List<ConfigFileSecondKind> selectByExample(ConfigFileSecondKindExample example);

    ConfigFileSecondKind selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfigFileSecondKind record, @Param("example") ConfigFileSecondKindExample example);

    int updateByExample(@Param("record") ConfigFileSecondKind record, @Param("example") ConfigFileSecondKindExample example);

    int updateByPrimaryKeySelective(ConfigFileSecondKind record);

    int updateByPrimaryKey(ConfigFileSecondKind record);

    
    
//  �Զ��� ��ѯ���   
	List<ConfigFileSecondKind> findByFirstId(Integer firstKindId);
}