package jing.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import jing.entity.User;
import jing.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService service;
	 
	@RequestMapping("/list")
	public String list(HttpServletRequest request){
		
		List<User> users = service.findUsers();
		request.setAttribute("users", users);
		return "/main.jsp";
	}
	
	@RequestMapping("toModify")
	public String toModify(ModelMap map,User user){
		System.out.println(user);
		User updUser = service.findUserById(user.getUserId());
		System.out.println(updUser);
		map.put("user", updUser);
		return "/modify.jsp";
	}
	@RequestMapping("modify")
	public String modify(User user){
		System.out.println(user);
		service.update(user);
		return "/success.jsp";
	}
	@RequestMapping("remove")
	public String remove(Integer userId){
		service.remove(userId);
		return "/success.jsp";
	}
	
	@RequestMapping("add")
	public String add(User user){
		service.add(user);
		return "/success.jsp";
	}
	
	
}
