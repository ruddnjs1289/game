package com.java.ex;

import java.util.Scanner;

public class Draw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("횟수를 설정해주세요");
	      Scanner sc = new Scanner(System.in);
	      int testNum;
	      int randomNum;
	      float temp = 0;
	      int sum=0;
	      testNum = sc.nextInt();      
	      for(int i = 1; i<= testNum; i++) {
	         temp = (float) (Math.random()*(100-1));
	         if(0 <= temp && temp <=2.5 ) {
	            System.out.println("★★★★★★★★★★");
	            System.out.println("[스페셜 라벨]");
	            System.out.println("매지컬 테일러");
	            System.out.println("★★★★★★★★★★");
	            sum++;
	         }
	         else if(2.6 <= temp && temp <= 5.5) {
	            System.out.println("★★★★★★★★★★");
	            System.out.println("[스페셜 라벨]");
	            System.out.println("테일러의 보물");
	            System.out.println("★★★★★★★★★★");
	            sum++;
	         }
	         else if(5.6 <= temp && temp <= 8.2) {
	            System.out.println("★★★★★★★★★★");
	            System.out.println("[스페셜 라벨]");
	            System.out.println("테일러의 구두");
	            System.out.println("★★★★★★★★★★");
	            sum++;
	         }
	         else if(8.3 <= temp && temp <= 11.4) {
	            System.out.println("★★★★★★★★★★");
	            System.out.println("[스페셜 라벨]");
	            System.out.println("대단한 테일러");
	            System.out.println("★★★★★★★★★★");
	            sum++;
	         }
	         else if(11.5 <= temp && temp <= 15.0) {
	            System.out.println("★★★★★★★★★★");
	            System.out.println("[스페셜 라벨]");
	            System.out.println("마법의 별단추");
	            System.out.println("★★★★★★★★★★");
	            sum++;
	         }
	         else if(11.6 <= temp && temp <= 20.0) {
	            System.out.println("==========");
	            System.out.println("오후의 산책");
	            System.out.println("==========");
	         }
	         else if(20.1 <= temp && temp <= 22.2) {
	            System.out.println("==========");
	            System.out.println("아이 무서워");
	            System.out.println("==========");
	         }
	         else if(22.3 <= temp && temp <= 27.3) {
	            System.out.println("==========");
	            System.out.println("팔랑 유령 러플");
	            System.out.println("==========");
	         }
	         else if(27.4 <= temp && temp <= 32.5) {
	            System.out.println("==========");
	            System.out.println("팔랑 유령 신발");
	            System.out.println("==========");
	         }
	         else if(32.6 <= temp && temp <= 36.6) {
	            System.out.println("==========");
	            System.out.println("제일 무서워");
	            System.out.println("==========");
	         }
	         else if(36.7 <= temp && temp <= 38.3) {
	            System.out.println("==========");
	            System.out.println("할로윈 레이븐 페르소나");
	            System.out.println("==========");
	         }
	         else if(38.4 <= temp && temp <= 41.4) {
	            System.out.println("==========");
	            System.out.println("할로윈 팬텀 슈트");
	            System.out.println("==========");
	         }
	         else if(41.5 <= temp && temp <= 46.5) {
	            System.out.println("==========");
	            System.out.println("할로윈 팬텀");
	            System.out.println("==========");
	         }
	         else if(46.6 <= temp && temp <= 50.6) {
	            System.out.println("==========");
	            System.out.println("좀비 곰돌이");
	            System.out.println("==========");
	         }
	         else if(50.7 <= temp && temp <= 54.7) {
	            System.out.println("==========");
	            System.out.println("외눈 안대");
	            System.out.println("==========");
	         }
	         else if(54.8 <= temp && temp <= 58.2) {
	            System.out.println("==========");
	            System.out.println("얼어붙는 눈빛");
	            System.out.println("==========");
	         }
	         else if(58.3 <= temp && temp <= 63.4) {
	            System.out.println("==========");
	            System.out.println("고쓰 페도라");
	            System.out.println("==========");
	         }
	         else if(63.5 <= temp && temp <= 68.6) {
	            System.out.println("==========");
	            System.out.println("오늘의 햇살 망토");
	            System.out.println("==========");
	         }
	         else if(68.7 <= temp && temp <= 73.7) {
	            System.out.println("==========");
	            System.out.println("하트패치 니트 팬츠");
	            System.out.println("==========");
	         }
	         else if(73.8 <= temp && temp <= 78.8) {
	            System.out.println("==========");
	            System.out.println("아기새 티셔츠");
	            System.out.println("==========");
	         }
	         else if(78.9 <= temp && temp <= 84) {
	            System.out.println("==========");
	            System.out.println("[30일] 미라 말풍선 반지");
	            System.out.println("==========");
	         }
	         else if(84.1 <= temp && temp <= 89.1) {
	            System.out.println("==========");
	            System.out.println("[30일]미라 명찰 반지");
	            System.out.println("==========");
	         }
	         else if(89.2 <= temp && temp <= 94.2) {
	            System.out.println("==========");
	            System.out.println("박쥐의 주인 이펙트 교환권");
	            System.out.println("==========");
	         }
	         else if(94.3 <= temp && temp <= 100) {
	            System.out.println("==========");
	            System.out.println("스카우터");
	            System.out.println("==========");
	         }

	      }
	}

}
