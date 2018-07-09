package com.zmx.action;

import java.util.Iterator;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Test {
	//[{"id":11,"username":"tom"},{"id":12,"username":"leo"}] 
	public static void main(String[] args) {		
	    //ʹ��gosn
	    Gson gson = new Gson();
	    //json
	    String jsonString = "{\"id\":11,\"username\":\"tom\",\"age\":\"22\"}";
	    //����ת��
	    Map<String,String> map = gson.fromJson(jsonString, new TypeToken<Map<String,String>>() {}.getType());
	    System.out.println(map);
	    //��ȡkeys
	    Iterator<String> it = map.keySet().iterator();
	    while(it.hasNext()) {
	    	System.out.println("keyName:"+it.next());
	    }
	    System.out.println("-----------------------------------");
	    //��ȡvalues
	    for(String str:map.values()) {
	    	System.out.println("value:"+str);
	    }
	}
}



































