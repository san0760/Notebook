package com.san.service.inter;

import com.san.domain.Users;

public interface UserServiceInter extends BaseInterface{
	//这里定义方法
	public Users checkUser(Users user);
	
	public Users getUsersByName(String username);
}
