package com.git.java.practice;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		//dont follow order of insertion
		//whenever we pass duplicate key ,it is going to replace old value with new value
		//allows duplicate values
		//we can add heterogenous keys
		HashMap map=new HashMap();
		map.put("a", 100);
		map.put("b", 200);
		map.put("c", 300);
		map.put(null, 400);
		map.put(50, 200);
		map.put(null, null);
		map.put("abc", null);
		map.put("c", null);
		System.out.println(map);
	}

}
