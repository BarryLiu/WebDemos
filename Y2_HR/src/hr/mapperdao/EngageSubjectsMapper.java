package hr.mapperdao;

import hr.entity.EngageSubjects;
import hr.entity.EngageSubjectsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EngageSubjectsMapper {
    int countByExample(EngageSubjectsExample example);

    int deleteByExample(EngageSubjectsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EngageSubjects record);

    int insertSelective(EngageSubjects record);

    List<EngageSubjects> selectByExample(EngageSubjectsExample example);

    EngageSubjects selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EngageSubjects record, @Param("example") EngageSubjectsExample example);

    int updateByExample(@Param("record") EngageSubjects record, @Param("example") EngageSubjectsExample example);

    int updateByPrimaryKeySelective(EngageSubjects record);

    int updateByPrimaryKey(EngageSubjects record);
}