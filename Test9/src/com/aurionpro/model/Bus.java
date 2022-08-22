package com.aurionpro.model;

public class Bus {
private int id;
private int seatt;
private String colors;
private String city;
public Bus(int id, int seatt, String colors, String city) {
	super();
	this.id = id;
	this.seatt = seatt;
	this.colors = colors;
	this.city = city;
}
public Bus() {
	
}
public int getId() {
	return id;
}
public int getSeatt() {
	return seatt;
}
public String getColors() {
	return colors;
}
public String getCity() {
	return city;
}


@Override
public String toString() {
	return "Bus [id=" + id + ", seatt=" + seatt + ", colors=" + colors + ", city=" + city + "]";
}




}
