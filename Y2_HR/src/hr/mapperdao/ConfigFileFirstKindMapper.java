package hr.mapperdao;

import hr.entity.ConfigFileFirstKind;
import hr.entity.ConfigFileFirstKindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigFileFirstKindMapper {
    int countByExample(ConfigFileFirstKindExample example);

    int deleteByExample(ConfigFileFirstKindExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfigFileFirstKind record);

    int insertSelective(ConfigFileFirstKind record);

    List<ConfigFileFirstKind> selectByExample(ConfigFileFirstKindExample example);

    ConfigFileFirstKind selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfigFileFirstKind record, @Param("example") ConfigFileFirstKindExample example);

    int updateByExample(@Param("record") ConfigFileFirstKind record, @Param("example") ConfigFileFirstKindExample example);

    int updateByPrimaryKeySelective(ConfigFileFirstKind record);

    int updateByPrimaryKey(ConfigFileFirstKind record);
}