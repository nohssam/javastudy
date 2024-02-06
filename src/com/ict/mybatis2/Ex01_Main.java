package com.ict.mybatis2;

import java.util.List;
import java.util.Scanner;

public class Ex01_Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 전체 테이블 보기
		// List<Ex01_VO> list =  Ex01_DAO.getList();
		// Ex01_Main test = new Ex01_Main();
		// test.prn2(list);
		
		// 전체 테이블 보기
		List<Ex01_VO> list =  Ex01_DAO.getList();
		prn(list);
		System.out.println();
		
		System.out.println("선택하세요");
		System.out.println("1.members테이블에 특정 데이터 보기 ");
		System.out.println("2.members테이블에 데이터 삽입 ");
		System.out.println("3.members테이블에 데이터 삭제 ");
		System.out.println("4.members테이블에 데이터 수정 ");
		System.out.println("5.members테이블 로그인 하기  ");
		System.out.print(">>>>>>>>>>>>>>>");
		int menu = scan.nextInt();
		switch (menu) {
			case 1: 
				System.out.print("검색할 idx : ");
				String idx = scan.next();
				Ex01_VO vo = Ex01_DAO.getOne(idx);
				prn(vo);
				break;
			case 2: 
				System.out.println("삽입할 정보를 입력하세요");
				
				System.out.print("idx : ");
				String idx2 = scan.next();
				
				
				System.out.print("id : ");
				String id = scan.next();
				
				
				System.out.print("pw : ");
				String pw = scan.next();
				
				
				System.out.print("username : ");
				String username = scan.next();
				
				
				System.out.print("age : ");
				String age = scan.next();
				
				// 날짜는 오늘 날짜로 
				Ex01_VO vo2 = new Ex01_VO();
				vo2.setIdx(idx2);
				vo2.setId(id);
				vo2.setPw(pw);
				vo2.setUsername(username);
				vo2.setAge(age);
				int res = Ex01_DAO.getInsert(vo2);
				if(res>0) {
					List<Ex01_VO> list2 =  Ex01_DAO.getList();
					prn(list2);
				}else {
					System.out.println("삽입 실패");
				}
				break;
			case 3: 
				// 파라미터가 하나 일때 String 처리
				/*
				System.out.print("삭제할 idx : ");
				String idx3 = scan.next();
				int res2 = Ex01_DAO.getDelete(idx3);
				if(res2>0) {
					List<Ex01_VO> list3 =  Ex01_DAO.getList();
					prn(list3);
				}else {
					System.out.println("삭제 실패");
				}
				break;
				*/
				// 파라미터가 하나 일때 vo 사용해서 처리
				System.out.print("삭제할 idx : ");
				String idx3 = scan.next();
				
				Ex01_VO vo3 = new Ex01_VO();
				vo3.setIdx(idx3);
				
				int res2 = Ex01_DAO.getDelete(vo3);
				if(res2>0) {
					List<Ex01_VO> list3 =  Ex01_DAO.getList();
					prn(list3);
				}else {
					System.out.println("삭제 실패");
				}
				break;
			case 4: 
				System.out.println("수정할 정보를 입력하세요");
				System.out.print("idx : ");
				String idx4 = scan.next();
				
				System.out.print("username : ");
				String username2 = scan.next();
				
				System.out.print("age : ");
				String age2 = scan.next();
				
				Ex01_VO vo4 = new Ex01_VO();
				vo4.setIdx(idx4);
				vo4.setUsername(username2);
				vo4.setAge(age2);
				
				int res3 = Ex01_DAO.getUpdate(vo4);
				if(res3>0) {
					List<Ex01_VO> list4 =  Ex01_DAO.getList();
					prn(list4);
				}else {
					System.out.println("수정 실패");
				}
				break;
			case 5:
				System.out.print("id : ");
				String id2 = scan.next();
				
				System.out.print("pw : ");
				String pw2 = scan.next();
				
				Ex01_VO vo5 = new Ex01_VO();
				vo5.setId(id2);
				vo5.setPw(pw2);
				
				Ex01_VO vo6 = Ex01_DAO.getLogin(vo5);
				if(vo6 != null) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패");
				}
				break;
		}
	}
	
	public static void prn(List<Ex01_VO> list) {
		System.out.println("IDX\tI D\tPWD\tUNAME\tAGE\tREGDATE");
		for (Ex01_VO k : list) {
			System.out.print(k.getIdx()+"\t");
			System.out.print(k.getId()+"\t");
			System.out.print(k.getPw()+"\t");
			System.out.print(k.getUsername()+"\t");
			System.out.print(k.getAge()+"\t");
			System.out.print(k.getRegdate().substring(0, 10)+"\n");
		}
	}
	public static void prn(Ex01_VO vo) {
		System.out.println("IDX\tI D\tPWD\tUNAME\tAGE\tREGDATE");
		System.out.print(vo.getIdx()+"\t");
		System.out.print(vo.getId()+"\t");
		System.out.print(vo.getPw()+"\t");
		System.out.print(vo.getUsername()+"\t");
		System.out.print(vo.getAge()+"\t");
		System.out.print(vo.getRegdate().substring(0, 10)+"\n");
		
	}
//	public void prn2(List<Ex01_VO> list) {
//		System.out.println("IDX\tI D\tPWD\tUNAME\tAGE\tREGDATE");
//		for (Ex01_VO k : list) {
//			System.out.print(k.getIdx()+"\t");
//			System.out.print(k.getId()+"\t");
//			System.out.print(k.getPw()+"\t");
//			System.out.print(k.getUsername()+"\t");
//			System.out.print(k.getAge()+"\t");
//			System.out.print(k.getRegdate().substring(0, 10)+"\n");
//		}
//	}

}












