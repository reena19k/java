package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class SyncBlockExample {
	public static void main(String[] args) {
		ABC obj = new ABC();
		List<String> li = new ArrayList<String>();
		obj.samplename("Anna Sam", li);
		System.out.println(obj.nm);
	}
}
