package hr.mapperdao;

import hr.entity.Data;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DataMapper {
	/**��ѯ��ǰ���ݿ����еı�*/
	List<Object> selectTables();
	/**���ݱ�����ѯ���е���*/
	List<Data> selectByTableName(@Param("tableName") String tableName);
	/**���ݲ�ͬ�ı�������ѯ���������Ĳ�ͬ������*/
	List<Object> selectByTableAndColumns(@Param("tableName") String tableName,@Param("columns")String columns);
}
