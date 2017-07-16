package hr.mapperdao;

import hr.entity.Bonus;
import hr.entity.BonusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BonusMapper {
    int countByExample(BonusExample example);

    int deleteByExample(BonusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bonus record);

    int insertSelective(Bonus record);

    List<Bonus> selectByExample(BonusExample example);

    Bonus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bonus record, @Param("example") BonusExample example);

    int updateByExample(@Param("record") Bonus record, @Param("example") BonusExample example);

    int updateByPrimaryKeySelective(Bonus record);

    int updateByPrimaryKey(Bonus record);
}