package hr.mapperdao;

import hr.entity.Data;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DataMapper {
	/**查询当前数据库所有的表*/
	List<Object> selectTables();
	/**根据表明查询所有的列*/
	List<Data> selectByTableName(@Param("tableName") String tableName);
	/**根据不同的表名，查询出他给定的不同的列名*/
	List<Object> selectByTableAndColumns(@Param("tableName") String tableName,@Param("columns")String columns);
}
