package day06;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String n1,n2;
		System.out.print("첫번째 문자열 입력 : ");
		n1 = sc.nextLine();

		System.out.print("두번째 문자열 입력 : ");
		n2 = sc.nextLine();

		System.out.println("n1 길이 : " + n1.length());
		System.out.println("n2 길이 : " + n2.length());
		
		System.out.println(n1 == n2);
		System.out.println(n1.equals(n2));
	}
}
