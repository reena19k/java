package com.aurionpro.model;

public class Regions {
	private int id;
	private String zone;

	public Regions(int id, String zone) {
		this.id = id;
		this.zone = zone;
	}

	public int getId() {
		return id;
	}

	public String getZone() {
		return zone;
	}

	@Override
	public String toString() {
		return "Regions{" + "id=" + id + ", zone='" + zone + '\'' + '}';
	}
}