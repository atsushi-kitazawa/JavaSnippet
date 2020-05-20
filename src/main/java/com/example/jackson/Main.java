package com.example.jackson;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		PlainObject pojo = new PlainObject();
		pojo.setString("test");
		pojo.setI(0);
		pojo.setList(Arrays.asList(new String[] { "list1", "list2", "list3" }));
		pojo.setMap(new HashMap<String, String>() {
			{
				put("key1", "value1");
				put("key2", "value2");
				put("key3", "value3");
			}
		});
		ChildObject co = new ChildObject();
		co.setS("aaa");
		co.setI(1);
		pojo.setCo(co);

		System.out.println("=== print1 =====");
		System.out.println(ObjectToJson.convertToJson(pojo));

		pojo = new PlainObject();
		pojo.setString("test");
		pojo.setI(0);
		pojo.setList(Arrays.asList(new String[] { "list1", "list2", "list3" }));
		pojo.setCo(co);

		System.out.println("=== print2(contain null value) =====");
		System.out.println(ObjectToJson.convertToJson(pojo));
	}
}
