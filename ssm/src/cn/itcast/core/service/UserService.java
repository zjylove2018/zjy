package cn.itcast.core.service;

import java.util.List;

import cn.itcast.core.pojo.QueryVo;
import cn.itcast.core.pojo.User;

public interface UserService {

//	public void saveUser(QueryVo vo);
	public void saveUser(User user);
	
	public List<User> findAllUser();
}
