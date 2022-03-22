package day05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int num;
//		System.out.print("수 입력 : ");
//		num = sc.nextInt();
//		switch(num) {
//		case 1:
//			System.out.println("1입력"); break;
//		case 2:
//			System.out.println("2입력"); break;
//		case 3:
//			System.out.println("3입력"); break;
//			default:System.out.println("그 외");     //else
//		}
//		
//		System.out.print("문자를 입력하세요 : ");
//		String s = sc.next();
//		
//		switch(s) {
//		case "안녕" :
//			System.out.println(s + "하세요");
//			break;
//		case "그래" :
//			System.out.println(s + " 반갑다");
//			break;
//		}
		
		while(true) {
			System.out.print("이름 입력 : ");
			String s = sc.next();
			System.out.println("당신 이름 : " + s + "군요");
		}
		
		
		
	}	
}
