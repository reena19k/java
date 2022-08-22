package com.aurionpro.model;

import java.util.*;

class ABC {
	String nm = "";
	public int cnt = 0;

	public void samplename(String stringexample, List<String> li) {
		//synchronized (this) {
			nm = stringexample;
			cnt++;
		//}
		li.add(stringexample);
	}
}
