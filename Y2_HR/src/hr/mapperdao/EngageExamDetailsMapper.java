package hr.mapperdao;

import hr.entity.EngageExamDetails;
import hr.entity.EngageExamDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EngageExamDetailsMapper {
    int countByExample(EngageExamDetailsExample example);

    int deleteByExample(EngageExamDetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EngageExamDetails record);

    int insertSelective(EngageExamDetails record);

    List<EngageExamDetails> selectByExample(EngageExamDetailsExample example);

    EngageExamDetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EngageExamDetails record, @Param("example") EngageExamDetailsExample example);

    int updateByExample(@Param("record") EngageExamDetails record, @Param("example") EngageExamDetailsExample example);

    int updateByPrimaryKeySelective(EngageExamDetails record);

    int updateByPrimaryKey(EngageExamDetails record);
}