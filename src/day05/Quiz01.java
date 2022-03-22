package day05;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1번 문제
		int day=0;
		System.out.print("요일을 입력하세요 : ");
		day = sc.nextInt();
		
		switch(day%7) {
		case 1:System.out.println("월요일");break;
		case 2:System.out.println("화요일");break;
		case 3:System.out.println("수요일");break;
		case 4:System.out.println("목요일");break;
		case 5:System.out.println("금요일");break;
		case 6:System.out.println("토요일");break;
		case 0:System.out.println("일요일");break;
		}
		
		

		//2번 문제
		
		int num=0;
		String home = null,work = null;
	
		while(true) {
			if(num == 3 && home != null && work != null) {
				break;
			}
			System.out.print("(번호선택)\n1.우리집 등록\n2.회사 등록\n3.등록 보기\n>>>");
			num = sc.nextInt();
			
			switch(num) {
			case 1:System.out.print("1.우리집 등록\n>>>");
				home = sc.next();
				break;
			case 2:System.out.print("2.회사 등록\n>>>");
				work = sc.next();
				break;
			case 3:
				if(home == null && work == null) {
					System.out.println("집 , 회사 없으세요?");
				}else if(work == null) {
					System.out.println("회사 등록해주세요");
				}else if(home == null){
					System.out.println("집 등록해주세요");
				}else {
				System.out.println("우리집 : " + home + "\n회사 : " + work);
				break;
				}
			default :System.out.println("다시 입력 또는 실행하세요\n");
				
			}			
		}
		
		
		
		
	}
}
