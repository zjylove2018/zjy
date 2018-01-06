package cn.itcast.core.dao;

import java.util.List;

import cn.itcast.core.pojo.QueryVo;
import cn.itcast.core.pojo.User;

public interface UserMapper {

//	public void saveUser(QueryVo vo);
	public void saveUser(User user);
	
	public List<User> findAllUser();
}
