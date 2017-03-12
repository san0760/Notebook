package com.san.service.imp;

import java.io.Serializable;

import com.san.service.inter.BaseInterface;
import com.san.util.hibernateUtil;

public abstract class BaseServiceImp implements BaseInterface {
	public Object findById(Class clazz,Serializable id){
		return hibernateUtil.findById(clazz, id);
	}
	public void save(Object obj){
		hibernateUtil.add(obj);
	}
}
