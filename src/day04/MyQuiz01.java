package day04;

import java.util.Scanner;

public class MyQuiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 시간 입력 : ");
		int H = sc.nextInt();
		System.out.print("시작 분 입력 : ");
		int M = sc.nextInt();
		System.out.print("조리 시간 입력 : ");
		int T = sc.nextInt();

		int end = 0, plus = 0;
								// 대입 ex)
		end = M + T;			// M = 20 , T = 45 --> end = 65
		plus = end / 60;      	// 65 / 60 = 1.08
		H += plus;				// H 에 시간을 더해줌
		M = end - (plus * 60);  // 최종적인 분은 65 - (1 * 60) 
		
		if(H > 23) {
			H = 0; 
			H += plus-1;
			System.out.println("예상 조리 완료 시간 " +  H + " : " + M);
		}else {
			System.out.println("예상 조리 완료 시간 " +  H + " : " + M);
		}
		
		if(H < 0 || H > 23 || M < 0 || M > 59 || T < 0 || T > 1000 ) {
			System.out.println("다시 실행해주세요. 오류발생!");
		}
		
		sc.close();

	}

}
