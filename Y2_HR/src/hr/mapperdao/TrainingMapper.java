package hr.mapperdao;

import hr.entity.Training;
import hr.entity.TrainingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainingMapper {
    int countByExample(TrainingExample example);

    int deleteByExample(TrainingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Training record);

    int insertSelective(Training record);

    List<Training> selectByExample(TrainingExample example);

    Training selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Training record, @Param("example") TrainingExample example);

    int updateByExample(@Param("record") Training record, @Param("example") TrainingExample example);

    int updateByPrimaryKeySelective(Training record);

    int updateByPrimaryKey(Training record);
}