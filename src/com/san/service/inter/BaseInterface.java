package com.san.service.inter;

import java.io.Serializable;

public interface BaseInterface {
	public Object findById(Class clazz,Serializable id);
	public void save(Object obj);
}
