package cn.itcast.core.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.core.pojo.QueryVo;
import cn.itcast.core.pojo.User;
import cn.itcast.core.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	/*@RequestMapping(value="save.action")
	public String saveUser(QueryVo vo){
		userService.saveUser(vo);
		
		return "insert";
	}*/
	@RequestMapping(value="save.action")
	public String saveUser(User user){
		userService.saveUser(user);
		
		return "insert";
	}
	
//	public List<User> findAllUser();
	@RequestMapping(value="insert.action")
	public String findAllUser(HttpServletRequest request){
		List<User> list = userService.findAllUser();
		request.setAttribute("userList", list);
		
		return "list";
	}
}
