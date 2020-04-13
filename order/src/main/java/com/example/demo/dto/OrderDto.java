package com.example.demo.dto;

public class OrderDto {
	private int oid;
	private  String ordername;
	private String desc;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public OrderDto(int oid, String ordername, String desc) {
		super();
		this.oid = oid;
		this.ordername = ordername;
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "OrderDto [oid=" + oid + ", ordername=" + ordername + ", desc=" + desc + "]";
	}
	

}
