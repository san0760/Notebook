package com.san.util;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.san.domain.Users;

public class hibernateUtil {
	private static SessionFactory sessionfactory;
	private static ThreadLocal<Session> threadLocal=new ThreadLocal<Session>();
	private hibernateUtil(){}
	static{
	Configuration cfg = new Configuration().configure();
	sessionfactory = cfg.buildSessionFactory(); 
	}
	public static Session getSession(){
		return sessionfactory.openSession();
	}
	public static Session getCurrentSession(){
		Session session=threadLocal.get();
		if(session==null){
			session=sessionfactory.openSession();
			threadLocal.set(session);
		}
		return session;
	}
	public static void closeCurrentSession(){
		Session s=getCurrentSession();
		if(s!=null&&s.isOpen()){
			s.close();
			threadLocal.set(null);
		}
	}
	//添加
	public static void add(Object obj){
		Session session=null;
		Transaction tr=null;
		try{
			session= hibernateUtil.getCurrentSession();
			session.save(obj);//区别：save()方法如果没有开启事务，它会执行一条插入语句，但之后由于没有提交事务，它又进行
			tr=session.beginTransaction();
			tr.commit();
			//session.persist(obj);//回滚了,而persist()方法在没有开启事务的时候，它根本不会去执行，即没有那条插入语句
		}catch(Exception e){
			throw new RuntimeException(e.getMessage());
		}
		
		
	}
	//修改
	public static void update(Object obj){
		Session session = null;
			session = hibernateUtil.getCurrentSession();
			session.update(obj);
	}
	//删除
	public static void delete(Object obj){
		Session session = null;
		
		session = hibernateUtil.getCurrentSession();
		session.delete(obj);
	}
	
	public static List excuteQuery(String hql,String parameters[]){
		List l=null;
		Session session=hibernateUtil.getCurrentSession();
		Query q=session.createQuery(hql);
		if(parameters!=null&&parameters.length>0){
			for(int i=0;i<parameters.length;i++){
				q.setString(i,parameters[i]);
			}
		}
		l=q.list();
		return l;
	}
	
	//查找 不需要开启事务
	public static Object findById(Class clazz,Serializable id){
		Session session = null;
			session = hibernateUtil.getCurrentSession();
		//这里需要区分一下get()与load()的区别，load()不会立即//去访问数据库只有在第一次使用的时候才会去加载（懒加载）；
		//load方法永远不可能返回空对象(如果不存在，其会产生一个user的子类)具体可以去查资料区别这两个方法
			//Object obj = session.load(clazz, id);
			Object obj = session.get(clazz, id);
			return obj;
	}
}

