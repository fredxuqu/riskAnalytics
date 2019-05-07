package com.himalaya.common.json;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class JSONUtil {

	public static void main(String[] args) {
		String json = "{\"objs\" : [{\"obj\" : 1411455611975}]}";
		
		String json1 = "{\"updateTime\" : \"2019-01-01\","
				+ "\"basic\":[{"
				+ "		\"name\":\"zhangsan\","
				+ "		\"idCard\":\"43011111111111\""
				+ "	},{"
				+ "		\"name\":\"lisi\","
				+ "		\"idCard\":\"5555555555555\""
				+ "	}]"
				+ "}";
		
		DocumentContext ext = JsonPath.parse(json);
		JsonPath p = JsonPath.compile("$.objs[0].obj");
		ext.set(p, 141145561197333L);
		String author = ext.jsonString();
		System.out.println(author);
		
		
		DocumentContext ext1 = JsonPath.parse(json1);
		JsonPath p1 = JsonPath.compile("$.basic[0].name");
		ext1.set(p1, "fred");
		String info = ext1.jsonString();
		System.out.println(json1);
		System.out.println(info);
	}
}
