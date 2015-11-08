package hr.mapperdao;

import hr.entity.EngageAnswer;
import hr.entity.EngageAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EngageAnswerMapper {
    int countByExample(EngageAnswerExample example);

    int deleteByExample(EngageAnswerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EngageAnswer record);

    int insertSelective(EngageAnswer record);

    List<EngageAnswer> selectByExample(EngageAnswerExample example);

    EngageAnswer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EngageAnswer record, @Param("example") EngageAnswerExample example);

    int updateByExample(@Param("record") EngageAnswer record, @Param("example") EngageAnswerExample example);

    int updateByPrimaryKeySelective(EngageAnswer record);

    int updateByPrimaryKey(EngageAnswer record);
}