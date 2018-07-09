package com.zmx.action;

enum Flag {
    SUCCESS(0,"表示成功"),FAILUE(1,"表示失败");
	Integer flag;
	String message;
	Flag(Integer flag,String message){
		this.flag = flag;
		this.message = message;
	}	
}
