package hr.mapperdao;

import hr.entity.MajorChange;
import hr.entity.MajorChangeExample;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MajorChangeMapper {
    int countByExample(MajorChangeExample example);

    int deleteByExample(MajorChangeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MajorChange record);

    int insertSelective(MajorChange record);

    List<MajorChange> selectByExample(MajorChangeExample example);

    MajorChange selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MajorChange record, @Param("example") MajorChangeExample example);

    int updateByExample(@Param("record") MajorChange record, @Param("example") MajorChangeExample example);

    int updateByPrimaryKeySelective(MajorChange record);

    int updateByPrimaryKey(MajorChange record);

	List<MajorChange> selectByCheck(@Param("start")int start,@Param("rows") int rows);

	int count1();

	List<MajorChange> selectAll(@Param("majorChange")MajorChange majorChange,@Param("start") int start,@Param("rows") int rows,
			@Param("dd1")Date dd1, @Param("dd2")Date dd2);

	int count2(@Param("majorChange")MajorChange majorChange,@Param("dd1")Date dd1, @Param("dd2")Date dd2);
}