package day05;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 반복문 사용 조건
		 - 규칙적으로 값이 변한다면   ex) 1씩 계속 증가
		 - 동일한 내용을 반복할 때	   ex) 값이 증가하면서 반복 or 그냥 반복
		*/
		
//		int num=1 , sum=0;
//		sum = sum  + num; num++;
//		sum = sum  + num; num++;
//		sum = sum  + num; num++;
//		sum = sum  + num; num++;
//		sum = sum  + num; num++;
//		sum = sum  + num; num++;
//		sum = sum  + num; num++;
//		sum = sum  + num; num++;
//		sum = sum  + num; num++;
//		sum = sum  + num; num++;
//		System.out.println("sum : " + sum);
		
//		int num=1, sum=0;
//		while(num<=10) {
//			sum = sum+num;
//			num++;
//		}
//		System.out.println("sum : " + sum);
//		
//		
//		
////	int num=1,sum=0;
//		//for(초기값 ; 조건식 ; 증감식)  세미콜론(;)이 반드시 두개가 들어가야한다.
//		for(; num<=10 ;) {
//			sum = sum+num;
//			num++;
//		}
//		System.out.println("sum : " + sum);
		
//		int repet;
//		System.out.println("수 입력 : ");
//		repet = sc.nextInt();
//		for(int i=0; i<repet; i++) {
//			System.out.println(i+1+"번 반복");
//		}
		
//		int num;
//		System.out.println("수 입력 : ");
//		num = sc.nextInt();
//		System.out.println("입력 값 까지의 짝수");
//		for(int i=2; i<=num; i+=2) {
//			System.out.println("i : " + i);	
//		}
	
//		for(int i=1; i<=num; i+=1) {
//			if(i%2 == 0)
//			System.out.println("i : " + i);
//		}
//		
		
		int num,i = 1;
		System.out.println("수를 입력 : ");
		num = sc.nextInt();
		while(i <= num) {
			if(i%2 == 0) {
				System.out.println("i : " + i);
				i+=1;
			}
		}
		
		
		
		
		
		
		
		
		
	}
}

















