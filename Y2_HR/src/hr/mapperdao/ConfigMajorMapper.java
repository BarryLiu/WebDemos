package hr.mapperdao;

import hr.entity.ConfigMajor;
import hr.entity.ConfigMajorExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ConfigMajorMapper {
    int countByExample(ConfigMajorExample example);

    int deleteByExample(ConfigMajorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfigMajor record);

    int insertSelective(ConfigMajor record);

    List<ConfigMajor> selectByExample(ConfigMajorExample example);

    ConfigMajor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfigMajor record, @Param("example") ConfigMajorExample example);

    int updateByExample(@Param("record") ConfigMajor record, @Param("example") ConfigMajorExample example);

    int updateByPrimaryKeySelective(ConfigMajor record);

    int updateByPrimaryKey(ConfigMajor record);

    
    
// 自定义 查询语句
	List<ConfigMajor> findByMajorKindId(Integer majorKindId);
}