package com.example.demo.Dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="menu")
public class MenuDao {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
private	int itemid;
private String iname;
private String itype;
private double price;
public int getItemid() {
	return itemid;
}
public void setItemid(int itemid) {
	this.itemid = itemid;
}
public String getIname() {
	return iname;
}
public void setIname(String iname) {
	this.iname = iname;
}
public String getItype() {
	return itype;
}
public void setItype(String itype) {
	this.itype = itype;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}
