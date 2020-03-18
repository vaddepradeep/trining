package com.example.demo.dao;

public class ResponseStatusDao {
	private int Errorcode;
	private String errormsg;
	public int getErrorcode() {
		return Errorcode;
	}
	public void setErrorcode(int errorcode) {
		Errorcode = errorcode;
	}
	public String getErrormsg() {
		return errormsg;
	}
	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}

}
