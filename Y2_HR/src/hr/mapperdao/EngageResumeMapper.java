package hr.mapperdao;

import hr.entity.EngageResume;
import hr.entity.EngageResumeExample;
import hr.utils.UtilBean;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface EngageResumeMapper {
    int countByExample(EngageResumeExample example);

    int deleteByExample(EngageResumeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EngageResume record);

    int insertSelective(EngageResume record);

    List<EngageResume> selectByExample(EngageResumeExample example);

    EngageResume selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EngageResume record, @Param("example") EngageResumeExample example);

    int updateByExample(@Param("record") EngageResume record, @Param("example") EngageResumeExample example);

    int updateByPrimaryKeySelective(EngageResume record);

    int updateByPrimaryKey(EngageResume record);
    
    
   
//  自定义查询语句

//	List<EngageResume> selectAll(@Param("engageResume")EngageResume engageResume,@Param("utilBean") UtilBean utilBean,
//			@Param("start")int start,@Param("rows") Integer rows);
//
//	int count(@Param("engageResume")EngageResume engageResume,@Param("utilBean") UtilBean utilBean);

	List<EngageResume> selectAll(@Param("engageResume")EngageResume engageResume,@Param("utilBean") UtilBean utilBean,
			@Param("queryStr")String queryStr,@Param("start") int start,@Param("rows") Integer rows);

	int count(@Param("engageResume")EngageResume engageResume, @Param("utilBean") UtilBean utilBean,
			@Param("queryStr")String queryStr);
	
	
	
}