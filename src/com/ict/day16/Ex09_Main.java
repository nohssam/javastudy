package com.ict.day16;

public class Ex09_Main {
	public static void main(String[] args) {
		Ex09_TestA testA = new Ex09_TestA();
		Ex09_TestB testB = new Ex09_TestB();
		
		// Runnable는 start()가 없으므로 사용 못함
		//testA.start();
		
		// Runnable를 상속받은 클래스를 인자로 넣자
		Thread t1 = new Thread(testA);
		t1.start();
		
		// 익명
		new Thread(testB).start();
		
		// 익명 : 안드로이드 식
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("111 : " + Thread.currentThread().getName());
				}
			}
		}).start();
	}
}
