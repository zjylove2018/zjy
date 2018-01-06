package cn.itcast.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.core.dao.UserMapper;
import cn.itcast.core.pojo.QueryVo;
import cn.itcast.core.pojo.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	/*@Override
	public void saveUser(QueryVo vo) {
		userMapper.saveUser(vo);
	}*/
	@Override
	public void saveUser(User user) {
		userMapper.saveUser(user);
	}

	@Override
	public List<User> findAllUser() {
		return userMapper.findAllUser();
	}

}
