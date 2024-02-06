package com.ict.day17;

public class Ex04_Main {
	public static void main(String[] args) {
		Ex04 t = new Ex04();
		new Thread(t,"dog").start();
		new Thread(t,"cat").start();
	}
}
