package hr.mapperdao;

import hr.entity.EngageInterview;
import hr.entity.EngageInterviewExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface EngageInterviewMapper {
    int countByExample(EngageInterviewExample example);

    int deleteByExample(EngageInterviewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EngageInterview record);

    int insertSelective(EngageInterview record);

    List<EngageInterview> selectByExample(EngageInterviewExample example);

    EngageInterview selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EngageInterview record, @Param("example") EngageInterviewExample example);

    int updateByExample(@Param("record") EngageInterview record, @Param("example") EngageInterviewExample example);

    int updateByPrimaryKeySelective(EngageInterview record);

    int updateByPrimaryKey(EngageInterview record);

   
// 自定义 查询语句   
	int selectAmountByResumeId(@Param("resumeId")Integer resumeId);
	List<EngageInterview> selectAll(@Param("start") int start,@Param("rows") int rows);
	
}