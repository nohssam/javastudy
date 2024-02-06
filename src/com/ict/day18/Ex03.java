package com.ict.day18;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex03 {
	public static void main(String[] args) {
		// 스트림 생성 : 기본 자료형 배열로부터 스트림 생성하기
		//           IntStream, DoubleStream, LongStream
		
		// IntStream<T> IntStream.of(int... values) // 가변인자
		// IntStream<T> IntStream.of(int[])
		// IntStream<T> Arrays.stream(int[])
		// IntStream<T> Arrays.stream(int[], 시작 index, 끝 index (포함X))
		
		Integer[] inttegerArr = {1,2,3,4,5};
		Stream<Integer> integerStream = Arrays.stream(inttegerArr);
		
		// 최종처리를 한 후에는 다시 호출할 수 없다.
		integerStream.forEach(i->System.out.print(i+"님 "));
		System.out.println();
		
		// 다시 사용하려면 다시 Stream 을 만들어야 한다.
		integerStream = Arrays.stream(inttegerArr);
		System.out.println("총 개수 : " + integerStream.count());
		
		// Stream<T> : count() O, sum() X, average() X 
		// integerStream = Arrays.stream(inttegerArr);
		// System.out.println("총 합 : " + integerStream.sum());
		// System.out.println("총 평균 : " + integerStream.average());
		
		System.out.println();
		
		// 기본자료형 배열을 스트림으로 만들자
		// IntStream :  count() O, sum() O, average() O 
		int[] intArr = {10,20,30,40,50};
		IntStream intStream1 = IntStream.of(10,20,30,40,50);
		IntStream intStream2 = IntStream.of(intArr);
		IntStream intStream3 = Arrays.stream(intArr);
		IntStream intStream4 = Arrays.stream(intArr,2,5);
		
		intStream1.forEach(i->System.out.print(i+" "));
		System.out.println();
		
		System.out.println("총 개수 : " + intStream2.count());
		System.out.println("총 합 : " + intStream3.sum());
		System.out.println("총 평균 : " + intStream4.average());
		
		
		
		
		
	}
}
