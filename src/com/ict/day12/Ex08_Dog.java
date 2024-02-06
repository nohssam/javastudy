package com.ict.day12;

// 추상클래스 상속
// 1. 일반적인 클래스가 추상클래스를 상속하면 
// 일반적인 클래스는 추상메서드를 오버라이딩해서 구체화 한다.
 class Ex08_Dog extends Ex08_Animal{

	@Override
	public void sound() {
		System.out.println("멍~멍~");
	}
 }
 // 2. 추상클래스가 추상클래스를 상속하면 오버라이딩을 
 //    하지 않아된다.   
 abstract class Ex08_Cat extends Ex08_Animal{
 }
 
 // 2. 추상클래스가 추상클래스를 상속하면 오버라이딩을 
 //    하지 않아된다.  
 abstract class Ex08_Cow extends Ex08_Animal{

	@Override
	public void sound() {
		System.out.println("음메~~");
	}
	public abstract void like(); 
 }
 
 abstract class Ex08_chicken extends Ex08_Animal{
	 public abstract void sleep();
 }
 
 class Ex08_My_Animal extends Ex08_chicken{
	@Override
	public void sleep() {}
	@Override
	public void sound() {}
	 
 }
 
 class Ex08_MyAnimal2 extends Ex08_Cow{
	@Override
	public void like() {
		
	}
	 
 }
 
 
 
 
 
 
 
 
