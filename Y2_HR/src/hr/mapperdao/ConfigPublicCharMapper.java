package hr.mapperdao;

import hr.entity.ConfigPublicChar;
import hr.entity.ConfigPublicCharExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ConfigPublicCharMapper {
    int countByExample(ConfigPublicCharExample example);

    int deleteByExample(ConfigPublicCharExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfigPublicChar record);

    int insertSelective(ConfigPublicChar record);

    List<ConfigPublicChar> selectByExample(ConfigPublicCharExample example);

    ConfigPublicChar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfigPublicChar record, @Param("example") ConfigPublicCharExample example);

    int updateByExample(@Param("record") ConfigPublicChar record, @Param("example") ConfigPublicCharExample example);

    int updateByPrimaryKeySelective(ConfigPublicChar record);

    int updateByPrimaryKey(ConfigPublicChar record);

    
 
}