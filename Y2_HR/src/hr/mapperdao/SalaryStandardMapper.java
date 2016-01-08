package hr.mapperdao;

import hr.entity.SalaryStandard;
import hr.entity.SalaryStandardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalaryStandardMapper {
    int countByExample(SalaryStandardExample example);

    int deleteByExample(SalaryStandardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SalaryStandard record);

    int insertSelective(SalaryStandard record);

    List<SalaryStandard> selectByExample(SalaryStandardExample example);

    SalaryStandard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SalaryStandard record, @Param("example") SalaryStandardExample example);

    int updateByExample(@Param("record") SalaryStandard record, @Param("example") SalaryStandardExample example);

    int updateByPrimaryKeySelective(SalaryStandard record);

    int updateByPrimaryKey(SalaryStandard record);
}