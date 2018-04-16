package jing.service;

import java.util.List;

import jing.dao.UserDao;
import jing.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public List<User> findUsers() {
		return userDao.selectAll();
	}

	public User findUserById(Integer userId) {
		return userDao.selectById(userId);
	}

	public void update(User user) {
		userDao.update(user);
	}

	public void remove(Integer userId) {
		userDao.delete(userId);
	}

	public void add(User user) {
		userDao.insert(user);
	}
	
}
