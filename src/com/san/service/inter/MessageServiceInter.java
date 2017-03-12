package com.san.service.inter;

import java.util.List;

import com.san.domain.Message;
import com.san.domain.Users;


public interface MessageServiceInter extends BaseInterface {
//显示所有message
	public List<Message> showMessage(Users user);
}
