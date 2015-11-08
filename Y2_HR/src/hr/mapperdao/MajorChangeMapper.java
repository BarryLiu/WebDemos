package hr.mapperdao;

import hr.entity.MajorChange;
import hr.entity.MajorChangeExample;
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
}