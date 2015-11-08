package hr.mapperdao;

import hr.entity.ConfigPrimaryKey;
import hr.entity.ConfigPrimaryKeyExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ConfigPrimaryKeyMapper {
    int countByExample(ConfigPrimaryKeyExample example);

    int deleteByExample(ConfigPrimaryKeyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfigPrimaryKey record);

    int insertSelective(ConfigPrimaryKey record);

    List<ConfigPrimaryKey> selectByExample(ConfigPrimaryKeyExample example);

    ConfigPrimaryKey selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfigPrimaryKey record, @Param("example") ConfigPrimaryKeyExample example);

    int updateByExample(@Param("record") ConfigPrimaryKey record, @Param("example") ConfigPrimaryKeyExample example);

    int updateByPrimaryKeySelective(ConfigPrimaryKey record);

    int updateByPrimaryKey(ConfigPrimaryKey record);

	 // 自定义 查询语句
    /**
     * 传入 要查的表名 ， 查询他的公共字段
     * @param tableName
     * @return
     */
	List<ConfigPrimaryKey> selectPrimaryKey(@Param("tableName") String tableName);
}