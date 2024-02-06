package com.ict.day11;

public class Ex15 {
	// static 초기화
	/* static {
	      초기화 내용 ;
	    }
	 */
	
	 int s1 = 100;
	 private int p1 = 300;
	 static int s2 ;   // 50000
	 static int s3 ;   // 0 
	 
	 public  static int k2 = 300;
	 static int k3 = 300;
	 private static int k4 = 500;
	 
	 
	 static {
		 s2 = 50000;
		 k2 = 20000;
		 m2 = 60000;
		 j2 = 40000;
	 }
	 
	 static int m2 ;       // 60000
	 static int j2 = 400;  //  400
}
