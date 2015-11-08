package hr.mapperdao;

import hr.entity.ConfigQuestionFirstKind;
import hr.entity.ConfigQuestionFirstKindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigQuestionFirstKindMapper {
    int countByExample(ConfigQuestionFirstKindExample example);

    int deleteByExample(ConfigQuestionFirstKindExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfigQuestionFirstKind record);

    int insertSelective(ConfigQuestionFirstKind record);

    List<ConfigQuestionFirstKind> selectByExample(ConfigQuestionFirstKindExample example);

    ConfigQuestionFirstKind selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfigQuestionFirstKind record, @Param("example") ConfigQuestionFirstKindExample example);

    int updateByExample(@Param("record") ConfigQuestionFirstKind record, @Param("example") ConfigQuestionFirstKindExample example);

    int updateByPrimaryKeySelective(ConfigQuestionFirstKind record);

    int updateByPrimaryKey(ConfigQuestionFirstKind record);
}