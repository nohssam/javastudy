package com.ict.day17;

public class Ex05_Main {
	public static void main(String[] args) {
		Ex05 t = new Ex05();
		new Thread(t, "tiger").start();
		new Thread(t, "lion").start();
		// new Thread(t, "dog").start();
	}
}
