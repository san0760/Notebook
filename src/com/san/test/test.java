package com.san.test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import com.san.util.MyMD5Util;
import com.san.util.hibernateUtil;

public class test {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//hibernateUtil.getSession();
		MyMD5Util md5=new MyMD5Util();
		System.out.println(md5.getEncryptedPwd("san"));
	}

}
