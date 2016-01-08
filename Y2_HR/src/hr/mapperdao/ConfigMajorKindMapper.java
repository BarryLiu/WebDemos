package hr.mapperdao;

import hr.entity.ConfigMajorKind;
import hr.entity.ConfigMajorKindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigMajorKindMapper {
    int countByExample(ConfigMajorKindExample example);

    int deleteByExample(ConfigMajorKindExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfigMajorKind record);

    int insertSelective(ConfigMajorKind record);

    List<ConfigMajorKind> selectByExample(ConfigMajorKindExample example);

    ConfigMajorKind selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfigMajorKind record, @Param("example") ConfigMajorKindExample example);

    int updateByExample(@Param("record") ConfigMajorKind record, @Param("example") ConfigMajorKindExample example);

    int updateByPrimaryKeySelective(ConfigMajorKind record);

    int updateByPrimaryKey(ConfigMajorKind record);
}