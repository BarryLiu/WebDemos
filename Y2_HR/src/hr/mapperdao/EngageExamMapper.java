package hr.mapperdao;

import hr.entity.EngageExam;
import hr.entity.EngageExamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EngageExamMapper {
    int countByExample(EngageExamExample example);

    int deleteByExample(EngageExamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EngageExam record);

    int insertSelective(EngageExam record);

    List<EngageExam> selectByExample(EngageExamExample example);

    EngageExam selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EngageExam record, @Param("example") EngageExamExample example);

    int updateByExample(@Param("record") EngageExam record, @Param("example") EngageExamExample example);

    int updateByPrimaryKeySelective(EngageExam record);

    int updateByPrimaryKey(EngageExam record);
}