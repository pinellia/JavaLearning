package com.firstspringapp.bean;

public class Helloworld {
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void printMsg() {
		System.out.println("your message:" + msg);
	}
}
