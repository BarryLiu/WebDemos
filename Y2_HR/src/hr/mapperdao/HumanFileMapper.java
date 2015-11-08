package hr.mapperdao;

import hr.entity.HumanFile;
import hr.entity.HumanFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HumanFileMapper {
    int countByExample(HumanFileExample example);

    int deleteByExample(HumanFileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HumanFile record);

    int insertSelective(HumanFile record);

    List<HumanFile> selectByExample(HumanFileExample example);

    HumanFile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HumanFile record, @Param("example") HumanFileExample example);

    int updateByExample(@Param("record") HumanFile record, @Param("example") HumanFileExample example);

    int updateByPrimaryKeySelective(HumanFile record);

    int updateByPrimaryKey(HumanFile record);

    
//    自定义查询语句
	int count(HumanFile humanFile);

	List<HumanFile> selectAll(@Param("humanFile")HumanFile humanFile,@Param("start") int start,@Param("rows") int rows);
}