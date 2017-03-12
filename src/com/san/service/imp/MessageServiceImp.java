package com.san.service.imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.san.domain.Message;
import com.san.domain.Users;
import com.san.service.inter.MessageServiceInter;
import com.san.util.hibernateUtil;

public class MessageServiceImp extends BaseServiceImp implements MessageServiceInter{

	@Override
	public List<Message> showMessage(Users user) {
		// TODO Auto-generated method stub
		String hql="from Message where to.userId=? or to.userId=3";
	//	Session s=hibernateUtil.getSession();
	//	Query q=s.createQuery(hql);
	//	q.setInteger(0, user.getUserId());
		String parameters[]={user.getUserId()+""};
		List<Message> l=hibernateUtil.excuteQuery(hql, parameters);
		return l;
	}

}
