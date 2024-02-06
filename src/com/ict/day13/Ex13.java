package com.ict.day13;

enum Type{
	WALKING, RUNNING, TRACKING, HIKING	
}

public class Ex13 {
	String name ;
	int size ;
	Type type;
	public static void main(String[] args) {
		Ex13 shose = new Ex13();
		shose.name = "나이키";
		shose.size = 275;
		shose.type = Type.RUNNING;
		
		
		System.out.println("이름 : " + shose.name);
		System.out.println("사이즈 : " + shose.size);
		System.out.println("종류 : " + shose.type);
	}

}
