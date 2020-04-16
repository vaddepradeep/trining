package com.example.demo.dto;

public class TransactinDto {
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public long getTo() {
	return to;
}
public void setTo(long to) {
	this.to = to;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
private long to;
private String status;
}
