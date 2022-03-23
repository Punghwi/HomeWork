package day06;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1~10까지 sum에 su를 더함.
		/*
		 do ~while(조건이 거짓이라도 무조건 한번은 실행)
		 ★종속 문장이 먼저★ 들어가기때문에 무조건 한번 실행하게 된다.
		 */
		
		int su=0, sum=0;
		do {
			su++;
			sum+=su;
		}while(su<=9);
		System.out.println("sum : " + sum);
		/*
		 
		 continue, break
		 - 반복문 안에서 사용한다.
		 #continue
		 - 반복문의 위쪽으로 이동시켜준다
		 break
		 - 반복문을 빠져나간다
		*/
		int i=0;
		while(i<5) {
			i++;
			if(i==3) {
				System.out.println("실행");
				continue;
			}
			System.out.println("i : " + i);
		}
		
//		int num=0;
//		
//		while(true) {
//			System.out.print("수 입력 : ");
//			num = sc.nextInt();
//			if(num == 4) {
//				System.out.println("다시 입력");
//				continue;
//			}
//			System.out.println("입력 값 : " + num);
//			if(num == 5) {
//				System.out.println("반복문 탈출");
//				break;
//			}
//		}
		
		while(true) {
			int num=0;
			System.out.println("수 입력 : ");
			num = sc.nextInt();
			switch(num) {
			case 1:
				break;
			case 2:
				System.out.println("종료");
				break; // switch 에서의 break; 이므로 switch만 탈출한다.
			}
			if(num == 2) {   // while문 탈출조건
				break; 
			}
		}
		
		
		
		
	}
}



















