package com.san.service.imp;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.san.domain.Users;
import com.san.service.inter.UserServiceInter;
import com.san.util.MyMD5Util;
import com.san.util.hibernateUtil;

//完成对Users对象的各种操作
public class UserServiceImp extends BaseServiceImp implements UserServiceInter {
//验证用户是否合法
	public Users checkUser(Users user){
		String hql="from Users where username=? and password=?";
		String parameters[]={user.getUsername(),user.getPassword()};
		List l=hibernateUtil.excuteQuery(hql, parameters);
//		Session s=hibernateUtil.getSession();
//		Query q=s.createQuery(hql);
//		if(parameters!=null&&parameters.length>0){
//			for(int i=0;i<parameters.length;i++){
//				q.setString(i,parameters[i]);
//			}
//		}
//		q.setString(0, user.getUsername());
//		q.setString(1, user.getPassword());
//		List<Users> l=q.list();
		if(l.size()==0){
			return null;
		}else{
			return (Users) l.get(0);
		}
		
	}

	@Override
	public Users getUsersByName(String username) {
		// TODO Auto-generated method stub
		String hql="from Users where username=?";
		String parameters[]={username};
		List<Users> l=hibernateUtil.excuteQuery(hql, parameters);
		Users u=l.get(0);
		return u;
	}
}
