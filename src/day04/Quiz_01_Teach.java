package day04;

import java.util.Scanner;

public class Quiz_01_Teach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1번 문제
//		int a;
//		System.out.print("숫자를 입력하세요 : ");
//		a = sc.nextInt();
//		if(a % 3 == 0) {
//			System.out.println(a + "는 3의 배수입니다.");
//		}else {
//			System.out.println(a + "는 3의 배수가 아닙니다.");
//		}
//		
		
		//2번 문제
//		int a;
//		System.out.println("숫자를 입력하세요 : ");
//		a = sc.nextInt();
//		if(a < 0) {
//			a = -a * 1;
//		}else if(a >= 0) {
//			a = a * 1;
//		}else {
//			System.out.println("오류");
//		}
//		System.out.println(a);
		
		//3번 문제
//		int a,b;
//		System.out.print("두 수를 입력하세요 : ");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		if(a > b) {
//			System.out.println("a가 b보다 더 큽니다.");
//		}else if(b > a){
//			System.out.println("b가 a보다 큽니다.");
//		}else {
//			System.out.println("두 값이 같습니다");
//		}
		
		//4번 문제
//		int a,b,c;
//		
//		System.out.print("세개의 수를 입력하세요 : ");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		
//		if(a > b && a > c) {
//			System.out.println("a가 가장 큽니다.");
//		}else if(b > a && b > c) {
//			System.out.println("b가 가장 큽니다.");
//		}else if(c > a && c > b) {
//			System.out.println("c가 가장 큽니다.");
//		}else {
//			System.out.println("세개의 값이 모두 같습니다.");
//		}
		
		//5번 문제
//		int a,b;
//		System.out.println("두 수를 입력하세요 : ");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		
//		
//		if(a > b && a%2 == 0) {
//			System.out.println("a가 b보다 더 크고, 짝수입니다.");
//		}else if(b > a && b%2 == 0){
//			System.out.println("b가 a보다 더 크고, 짝수입니다.");
//		}else if (a == b){
//			System.out.println("두 값이 같습니다");
//		}else {
//			System.out.println("짝수가 아니거나, 값이 비정상적입니다.");
//		}
		
		//6번 문제
//		int a,b,sum;
//		System.out.println("두 수를 입력하세요 : ");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		
//		sum = a + b;
//		
//		if(sum%2 == 0 && sum%3 == 0) {
//			System.out.println("짝수이고, 3의 배수입니다.");
//		}else if(sum%2 ==0 && sum%3 == 1) {
//			System.out.println("짝수이지만 3의 배수는 아닙니다.");
//		}else if(sum%2 ==1 && sum%3 ==0) {
//			System.out.println("3의 배수이지만 짝수는 아닙니다.");
//		}else {
//			System.out.println("일치하는 조건이 존재하지 않습니다.");
//		}
		
		
		//7번
//		int coffee,tot;
//		coffee = 2000;
//		
//		System.out.print("커피 개수를 입력하세요 : ");
//		
//		tot = sc.nextInt();
//		coffee = coffee * tot ;
//		
//		if(tot > 10) {
//			coffee = 20000 + 1500 * (tot-10);		
//		}
//		System.out.println("입력한 갯수 : " + tot + "개. 총 : " + coffee + "원 입니다.");
		
		
		
		//8번
		int usb,count;
		usb = 5000;
		System.out.print("커피 몇개 구매하세요? : ");
		count = sc.nextInt();
		
		if(count > 10 && count <= 99) {
			usb = (int) (count * 5000 - (count * (5000*0.1)) + 50000);
		}else if(count > 100) {
			usb = (int) (count * 5000 - (count * (5000*0.12)) + 50000);
		}
		System.out.println("주문하신 개수는 : " + count + "개이며, 총 " + usb + "원 입니다.");
		
		
		
		
		
		//9번
//		int kor,eng,math,sum;
//		double avg;
//		System.out.print("국어 점수 입력 : ");
//		kor = sc.nextInt();
//		System.out.print("영어 점수 입력 : ");
//		eng = sc.nextInt();
//		System.out.print("수학 점수 입력 : ");
//		math = sc.nextInt();
//		
//		sum = kor + eng + math;
//		avg = sum/3;
//		
//		if(avg >= 60 && kor >= 40 && eng >= 40 && math >= 40) {
//			System.out.println("총합 : " + sum + "\t평균 : " + avg + " 합격");
//		}else if(avg < 60 && kor < 40) {
//			System.out.println("총합 : " + sum + "\t평균 : " + avg + " 국어과목 불합격");
//		}else if(avg < 60 && eng < 40) {
//			System.out.println("총합 : " + sum + "\t평균 : " + avg + " 영어과목 불합격");
//		}else if(avg < 60 && eng < 40) {
//			System.out.println("총합 : " + sum + "\t평균 : " + avg + " 수학과목 불합격");
//		}else if(avg < 60) {
//			System.out.println("총합 : " + sum + "\t평균 : " + avg + " 평균점수 낮음. 불합격");
//		}
//		if(avg >= 90) {
//			System.out.println("등급 : A");
//		}else if(avg >= 80) {
//			System.out.println("등급 : B");
//		}else if(avg >= 70) {
//			System.out.println("등급 : C");
//		}else if(avg >= 60) {
//			System.out.println("등급 : D");
//		}else {
//			System.out.println("등급 : F");
//		}
//		
		
		
		
		
		
		
		
	}
}






















