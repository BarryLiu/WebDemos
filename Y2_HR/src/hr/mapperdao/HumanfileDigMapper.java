package hr.mapperdao;

import hr.entity.HumanfileDig;
import hr.entity.HumanfileDigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HumanfileDigMapper {
    int countByExample(HumanfileDigExample example);

    int deleteByExample(HumanfileDigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HumanfileDig record);

    int insertSelective(HumanfileDig record);

    List<HumanfileDig> selectByExample(HumanfileDigExample example);

    HumanfileDig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HumanfileDig record, @Param("example") HumanfileDigExample example);

    int updateByExample(@Param("record") HumanfileDig record, @Param("example") HumanfileDigExample example);

    int updateByPrimaryKeySelective(HumanfileDig record);

    int updateByPrimaryKey(HumanfileDig record);
}