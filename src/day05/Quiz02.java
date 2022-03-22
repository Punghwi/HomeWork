package day05;

import java.util.Scanner;

public class Quiz02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1번 문제
//		for(int i=0; i<=3 ;i++) {
//			System.out.println("hello");
//		}
		//2번 문제
//		int sum=0;
//		
//		for(int i=1; i<=100; i++) {
//			sum +=i;
//			if(sum == 528) {
//				System.out.println("i 값 : " +  i);
//				break;
//			}
//		}
		
		//4번 문제
//		int sum=1;
//		
//		for(int i=1; i<=30;i++) {
//			if(i == 30) {
//			System.out.println(i + "번째 날 금액 : " + sum + "원");
//			}
//			sum = sum*2;
//		}
		
		//5번 문제

//		int sum=0;
//		
//		for(int i=1; i<=1000; i++) {
//			if(i%3==0 && i%5==0) {
//				sum+=i;
//			}else if(i%3==0) {
//				
//			}else {
//				sum+=i;
//			}
//			System.out.println(i + "번째 값 : " + sum);
//		}
//		System.out.println("현재 값 : " + sum);
		
		
		//6번 문제
		//1부터 시작하여 홀수의 합을 구하면서 그 합이 
		//10000을 넘지 않는 마지막 수를 구하는 프로그램
		
		
//		int i,sum=0;
//		for(i=1;sum<10000;i++) {
//			if(i % 2 == 1) {
//				sum+=i;
//			}
//		}
//		i--;
//		System.out.println(i);
		
		//7번 문제
		//쌀 100통이 저장되어 있는 창고에 암수 1쌍의 쥐가 있다. 
		//쥐 한마리가 하루에 20g씩의 쌀을 먹고, 10일(10,20,30)마다 쥐의 수가 2배씩 증가한다. 
		//며칠 만에 창고의 쌀이 모두 쥐의 먹이가 될까. 그리고 쥐는 총 몇마리 인가?
		//(쌀 한통 = 1kg)(쌀을 먹은 후에 2배 증가하는 조건)
		
		//1kg = 1000g * 100 = 100,000
		//한마리 하루 20g 먹음
		// day%10==0 -> 쥐*2
		
		int day,rice,mouse = 2;
		rice = 100000;
		
		for(day=1; rice>0; day++) {
			rice -= mouse*20;
			if(day%10==0) {
				mouse*=2;
			}
		}
		day--;
		System.out.println(day + "일 " + mouse + "마리 " + rice + "g남음");
		
		
		
		//8번 문제
		//두 수의 공배수와 최대 공약수를 구하는 프로그램을 작성하라.
		// 최소공배수 = 공배수 중에서 가장 작은 정수
		// 최대공약수 = 공약수 중에서 가장 큰 수
		
		//9번 문제
		//어떤 수의 약수를 구하는 프로그램을 작성하여라
		// 약수 = 어떤 수를 정수로 나눌 수 있는 수
		
		//10번 문제
		//1에서 1000까지의 자연수중에서 4로 나누어도 6으로 나누어도 나머지가 1인 수의 합을 출력하라
		
		
		
		
		
	}
}
















