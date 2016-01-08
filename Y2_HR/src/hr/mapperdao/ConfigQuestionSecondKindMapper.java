package hr.mapperdao;

import hr.entity.ConfigQuestionSecondKind;
import hr.entity.ConfigQuestionSecondKindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigQuestionSecondKindMapper {
    int countByExample(ConfigQuestionSecondKindExample example);

    int deleteByExample(ConfigQuestionSecondKindExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfigQuestionSecondKind record);

    int insertSelective(ConfigQuestionSecondKind record);

    List<ConfigQuestionSecondKind> selectByExample(ConfigQuestionSecondKindExample example);

    ConfigQuestionSecondKind selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfigQuestionSecondKind record, @Param("example") ConfigQuestionSecondKindExample example);

    int updateByExample(@Param("record") ConfigQuestionSecondKind record, @Param("example") ConfigQuestionSecondKindExample example);

    int updateByPrimaryKeySelective(ConfigQuestionSecondKind record);

    int updateByPrimaryKey(ConfigQuestionSecondKind record);
}