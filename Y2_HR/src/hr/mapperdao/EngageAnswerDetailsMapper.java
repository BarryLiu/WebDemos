package hr.mapperdao;

import hr.entity.EngageAnswerDetails;
import hr.entity.EngageAnswerDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EngageAnswerDetailsMapper {
    int countByExample(EngageAnswerDetailsExample example);

    int deleteByExample(EngageAnswerDetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EngageAnswerDetails record);

    int insertSelective(EngageAnswerDetails record);

    List<EngageAnswerDetails> selectByExample(EngageAnswerDetailsExample example);

    EngageAnswerDetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EngageAnswerDetails record, @Param("example") EngageAnswerDetailsExample example);

    int updateByExample(@Param("record") EngageAnswerDetails record, @Param("example") EngageAnswerDetailsExample example);

    int updateByPrimaryKeySelective(EngageAnswerDetails record);

    int updateByPrimaryKey(EngageAnswerDetails record);
}