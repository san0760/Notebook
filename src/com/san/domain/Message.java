package com.san.domain;

public class Message {
	private Integer mesId;
	private java.util.Date mesTime;
	private String main;
	private Users from;
	private Users to;
	public Integer getMesId() {
		return mesId;
	}
	public void setMesId(Integer mesId) {
		this.mesId = mesId;
	}
	public java.util.Date getMesTime() {
		return mesTime;
	}
	public void setMesTime(java.util.Date mesTime) {
		this.mesTime = mesTime;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public Users getFrom() {
		return from;
	}
	public void setFrom(Users from) {
		this.from = from;
	}
	public Users getTo() {
		return to;
	}
	public void setTo(Users to) {
		this.to = to;
	}
}
