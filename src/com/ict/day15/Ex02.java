package com.ict.day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex02 {
	public static void main(String[] args) {
		// Set 인터페이스를 구현한 클래스 : HashSet, TreeSet
		// 특징 : 중복불가, 특정기준으로 정렬이 안됨
		//      (단, TreeSet은 항상 오름차순을 유지한다.)
		//      주머니 구조라고 생각하자
		// 형식) HashSet<제네릭=객체타입=클래스> 참조변수 = new HashSet<[제네닉]>();
		//      TreeSet<제네릭=객체타입=클래스> 참조변수 = new TreeSet<[제네닉]>();
		
		// 1. 컬렉션 생성
		// 기본자료형은 안됨
		// HashSet<int> h1 = new HashSet<int>();
		
		HashSet<Integer> h1 = new HashSet<>();
		HashSet<Double> h2 = new HashSet<Double>();
		TreeSet<String> h3 = new TreeSet<String>();
		TreeSet<Character> h4 = new TreeSet<Character>();
		
		// 2.컬렉션에 객체 넣기 (add(E e))
		Integer k1 = new Integer(10);
		Integer k2 = new Integer("20");
		
		h1.add(k1);
		h1.add(k2);
		h1.add(new Integer(30));
		h1.add(new Integer("40"));
		// int => Integer => 오토박싱 : 기본자료형을 객체로 변경
		h1.add(50);
		// 바로 String 안됨
		// h1.add("60");
		System.out.println(h1.add(10));
		
		System.out.println(h1);
		
		// 일반 for문을 사용할 수 없다.
		// for (int i = 0; i < h1.size(); i++) {
		//	  System.out.println(h1[i]);
		// }
		
		// 개선된 for문 사용가능
		for (Integer k : h1) {
			System.out.println(k+1000);
		}
		System.out.println();
		
		Iterator<Integer> it =  h1.iterator();
		while (it.hasNext()) {
			int s = it.next();
			System.out.println(s + 5000);
		}
		
		// HashSet<Double> h2 = new HashSet<Double>();
		h2.add(10.0);
		h2.add(21.5);
		
		// 오류
		// h2.add(10);
		
		double d1 = 3.1;
		double d2 = 10 ;
		
		
	}
}










