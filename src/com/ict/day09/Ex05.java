package com.ict.day09;

public class Ex05 {
	public static void main(String[] args) {
		// Ex04 클래스를 객체로 만들어야 
		// Ex04가 가지고 있는 필드와 메서드를 사용할 수 있다.
		
		// Ex04 클래스를 객체로 만들기
		Ex04 t = new Ex04();
		
		System.out.println(t.name);
		
		// Ex04 에 있는 play01메소드를 호출하자
		// play01이 void 이기 때문에 데이터를 가져오지는 않는다.
		//System.out.println(1);
		System.out.println(t.total);
		t.play01();
		System.out.println(t.total);
		//System.out.println(4);
		
		t.play02();
		// System.out.println(t.sum);
		
		int k = t.play03();	
		System.out.println(k);
	}
}
