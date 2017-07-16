package hr.mapperdao;

import hr.entity.EngageMajorRelease;
import hr.entity.EngageMajorReleaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EngageMajorReleaseMapper {
    int countByExample(EngageMajorReleaseExample example);

    int deleteByExample(EngageMajorReleaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EngageMajorRelease record);

    int insertSelective(EngageMajorRelease record);

    List<EngageMajorRelease> selectByExample(EngageMajorReleaseExample example);

    EngageMajorRelease selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EngageMajorRelease record, @Param("example") EngageMajorReleaseExample example);

    int updateByExample(@Param("record") EngageMajorRelease record, @Param("example") EngageMajorReleaseExample example);

    int updateByPrimaryKeySelective(EngageMajorRelease record);

    int updateByPrimaryKey(EngageMajorRelease record);

    
 // 自定义查询语句   
	List<EngageMajorRelease> selectPage(@Param("emajorRelease")EngageMajorRelease emajorRelease,
			@Param("start")int start, @Param("rows")int rows);
}