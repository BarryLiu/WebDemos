package jing.dao;

import java.util.List;

import javax.annotation.Resource;

import jing.entity.User;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	private static final String NS="jing.entity.UserMapper"; //值随意，如果要用springMVC3.0 以后的 mapper 接口查询方式的话，Mapper.xml 的命名空间就要指向哪个接口路径
	@Resource(name="template")
	private SqlSessionTemplate template;

	public List<User> selectAll() {
		return template.selectList(NS+".selectAll");
	}
	
	public User selectById(Integer id){
		return template.selectOne(NS+".selectById",id);
	}
	
	public void insert(User user){
		template.insert(NS+".insert",user);
	}
	public void update(User user){
		template.update(NS+".update", user);
	}

	public void delete(Integer userId) {
		template.delete(NS+".delete",userId);
	}
	
}
