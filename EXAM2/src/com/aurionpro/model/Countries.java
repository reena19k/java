package com.aurionpro.model;

public class Countries {
	private String Code;
	private String countryName;
	private int regId;

	public Countries(String code, String countryName, int regId) {
		Code = code;
		this.countryName = countryName;
		this.regId = regId;
	}

	public String getCode() {
		return Code;
	}

	public String getCountryName() {
		return countryName;
	}

	public int getRegId() {
		return regId;
	}

	@Override
	public String toString() {
		return "Countries{" + "Code='" + Code + '\'' + ", countryName='" + countryName + '\'' + ", regId=" + regId
				+ '}';
	}
}
