package com.zmx.action;

enum Flag {
    SUCCESS(0,"��ʾ�ɹ�"),FAILUE(1,"��ʾʧ��");
	Integer flag;
	String message;
	Flag(Integer flag,String message){
		this.flag = flag;
		this.message = message;
	}	
}