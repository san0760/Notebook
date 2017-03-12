package com.san.domain;

import java.util.Set;

public class Users {
	private Integer userId;
	private String username;
	private String password;
	//一个用户可以发送和接收多个消息，one to many，需要两个集合
	private Set<Message> sendMessage;
	private Set<Message> getMessage;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<Message> getSendMessage() {
		return sendMessage;
	}
	public void setSendMessage(Set<Message> sendMessage) {
		this.sendMessage = sendMessage;
	}
	public Set<Message> getGetMessage() {
		return getMessage;
	}
	public void setGetMessage(Set<Message> getMessage) {
		this.getMessage = getMessage;
	}
	
}
