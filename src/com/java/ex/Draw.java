package com.java.ex;

import java.util.Scanner;

public class Draw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ƚ���� �������ּ���");
	      Scanner sc = new Scanner(System.in);
	      int testNum;
	      int randomNum;
	      float temp = 0;
	      int sum=0;
	      testNum = sc.nextInt();      
	      for(int i = 1; i<= testNum; i++) {
	         temp = (float) (Math.random()*(100-1));
	         if(0 <= temp && temp <=2.5 ) {
	            System.out.println("�ڡڡڡڡڡڡڡڡڡ�");
	            System.out.println("[����� ��]");
	            System.out.println("������ ���Ϸ�");
	            System.out.println("�ڡڡڡڡڡڡڡڡڡ�");
	            sum++;
	         }
	         else if(2.6 <= temp && temp <= 5.5) {
	            System.out.println("�ڡڡڡڡڡڡڡڡڡ�");
	            System.out.println("[����� ��]");
	            System.out.println("���Ϸ��� ����");
	            System.out.println("�ڡڡڡڡڡڡڡڡڡ�");
	            sum++;
	         }
	         else if(5.6 <= temp && temp <= 8.2) {
	            System.out.println("�ڡڡڡڡڡڡڡڡڡ�");
	            System.out.println("[����� ��]");
	            System.out.println("���Ϸ��� ����");
	            System.out.println("�ڡڡڡڡڡڡڡڡڡ�");
	            sum++;
	         }
	         else if(8.3 <= temp && temp <= 11.4) {
	            System.out.println("�ڡڡڡڡڡڡڡڡڡ�");
	            System.out.println("[����� ��]");
	            System.out.println("����� ���Ϸ�");
	            System.out.println("�ڡڡڡڡڡڡڡڡڡ�");
	            sum++;
	         }
	         else if(11.5 <= temp && temp <= 15.0) {
	            System.out.println("�ڡڡڡڡڡڡڡڡڡ�");
	            System.out.println("[����� ��]");
	            System.out.println("������ ������");
	            System.out.println("�ڡڡڡڡڡڡڡڡڡ�");
	            sum++;
	         }
	         else if(11.6 <= temp && temp <= 20.0) {
	            System.out.println("==========");
	            System.out.println("������ ��å");
	            System.out.println("==========");
	         }
	         else if(20.1 <= temp && temp <= 22.2) {
	            System.out.println("==========");
	            System.out.println("���� ������");
	            System.out.println("==========");
	         }
	         else if(22.3 <= temp && temp <= 27.3) {
	            System.out.println("==========");
	            System.out.println("�ȶ� ���� ����");
	            System.out.println("==========");
	         }
	         else if(27.4 <= temp && temp <= 32.5) {
	            System.out.println("==========");
	            System.out.println("�ȶ� ���� �Ź�");
	            System.out.println("==========");
	         }
	         else if(32.6 <= temp && temp <= 36.6) {
	            System.out.println("==========");
	            System.out.println("���� ������");
	            System.out.println("==========");
	         }
	         else if(36.7 <= temp && temp <= 38.3) {
	            System.out.println("==========");
	            System.out.println("�ҷ��� ���̺� �丣�ҳ�");
	            System.out.println("==========");
	         }
	         else if(38.4 <= temp && temp <= 41.4) {
	            System.out.println("==========");
	            System.out.println("�ҷ��� ���� ��Ʈ");
	            System.out.println("==========");
	         }
	         else if(41.5 <= temp && temp <= 46.5) {
	            System.out.println("==========");
	            System.out.println("�ҷ��� ����");
	            System.out.println("==========");
	         }
	         else if(46.6 <= temp && temp <= 50.6) {
	            System.out.println("==========");
	            System.out.println("���� ������");
	            System.out.println("==========");
	         }
	         else if(50.7 <= temp && temp <= 54.7) {
	            System.out.println("==========");
	            System.out.println("�ܴ� �ȴ�");
	            System.out.println("==========");
	         }
	         else if(54.8 <= temp && temp <= 58.2) {
	            System.out.println("==========");
	            System.out.println("���ٴ� ����");
	            System.out.println("==========");
	         }
	         else if(58.3 <= temp && temp <= 63.4) {
	            System.out.println("==========");
	            System.out.println("�� �䵵��");
	            System.out.println("==========");
	         }
	         else if(63.5 <= temp && temp <= 68.6) {
	            System.out.println("==========");
	            System.out.println("������ �޻� ����");
	            System.out.println("==========");
	         }
	         else if(68.7 <= temp && temp <= 73.7) {
	            System.out.println("==========");
	            System.out.println("��Ʈ��ġ ��Ʈ ����");
	            System.out.println("==========");
	         }
	         else if(73.8 <= temp && temp <= 78.8) {
	            System.out.println("==========");
	            System.out.println("�Ʊ�� Ƽ����");
	            System.out.println("==========");
	         }
	         else if(78.9 <= temp && temp <= 84) {
	            System.out.println("==========");
	            System.out.println("[30��] �̶� ��ǳ�� ����");
	            System.out.println("==========");
	         }
	         else if(84.1 <= temp && temp <= 89.1) {
	            System.out.println("==========");
	            System.out.println("[30��]�̶� ���� ����");
	            System.out.println("==========");
	         }
	         else if(89.2 <= temp && temp <= 94.2) {
	            System.out.println("==========");
	            System.out.println("������ ���� ����Ʈ ��ȯ��");
	            System.out.println("==========");
	         }
	         else if(94.3 <= temp && temp <= 100) {
	            System.out.println("==========");
	            System.out.println("��ī����");
	            System.out.println("==========");
	         }

	      }
	}

}
