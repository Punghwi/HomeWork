package day06;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String login_d=null, pw_d=null, login=null,pw=null;
		int num=0;
		
		while(true) {
			System.out.print("1.로그인\n2.회원가입\n3.나가기\n>>> ");
			num = sc.nextInt();
			if(num==3) {
				System.out.println("회원가입을 종료합니다.");
				break;
			}
			
			switch(num){
			case 1:
				if(login_d == null && pw_d == null) {
					System.out.println("회원가입 먼저 진행하세요");
					break;
				}else {
					System.out.print("ID 입력 : ");
					login = sc.next();
					System.out.print("PW 입력 : ");
					pw = sc.next();
				}
				if(login_d.equals(login) && pw_d.equals(pw)){
					System.out.println("로그인 성공!");
					break;
				}else {
					System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
					break;
				}
			case 2:
				if(login_d != null && pw_d != null) {
					System.out.println("이미 회원가입 하셨습니다.");
					break;
				}else {
				System.out.print("회원가입 진행\nID 입력 : ");
				login_d = sc.next();
				System.out.print("PW 입력 : ");
				pw_d = sc.next();
				System.out.println("회원가입 완료되었습니다.");
				break;
				}
			}
		}
		System.out.println("프로그램이 종료 되었습니다.");
		sc.close();
	}	
}

















