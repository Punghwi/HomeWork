package day04;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int user1=0, user2=0;
		
		System.out.println("가위 : 1 , 바위 : 2 , 보 : 3");
		System.out.print("User1 입력 : ");
		user1 = sc.nextInt();
		System.out.print("User2 입력 : ");
		user2 = sc.nextInt();
		
		if(user1 == user2) {
			System.out.println("비겼습니다!");
		}else if(user1 == 1 && user2 == 3 || user1 == 2 && user2 == 1 || user1 == 3 && user2 == 2) {
			System.out.println("User1 님이 이겼습니다!");
		}else {
			System.out.println("User2 님이 이겼습니다.");
		}
		System.out.println("게임 종료");
		
		
	}
}
