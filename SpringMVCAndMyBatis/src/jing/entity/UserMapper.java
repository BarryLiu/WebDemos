package jing.entity;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**也可以用mapper接口的方法来查询   */
public interface UserMapper {
	
	List<User> selectAll();
	
	User selectById(@Param("id") Integer id);
	
	void insert(@Param("user") User user);
	
	void update(@Param("user") User user);
	
	void delete(@Param("userId") Integer userId);
}
