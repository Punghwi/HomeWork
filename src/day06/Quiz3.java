package day06;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 커피(200) 코코아(250) 3.반환 4.종료 메뉴를 선택하세요
		 만약 돈이 없다면 돈을 넣어주세요.
		 돈이 있는 상태에서 메뉴 선택시 
		 맛있게 드세요 + 현재 남은 잔액 알려주기
		 반환 선택시 남은잔액 돌려주기
		 종료 누르면 종료
		 */
		
int num=0,money=0,cof=200,coco=250,su=0;
		
		System.out.print("요금을 투입 하세요 >>> ");
		money = sc.nextInt();
		
		while(true) {
			
			if(num==4) {
				System.out.println("이용해 주셔서 감사합니다. 안녕히 가세요.");
				break;
			}
			
			System.out.println("현재 남은 잔액은 " + money + "원 입니다.");
			System.out.println("==========커피 자판기==========\n");
			System.out.println("1. 커피(200)\t2. 코코아(250)\t3. 반환\t4. 종료");
			System.out.print("메뉴를 선택하세요 >>> ");
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				if(money<cof) {
					System.out.print("요금이 부족합니다.\n잔액 충전하시겠습니까? 1.Y 2.N\n>>>");
					su = sc.nextInt();
					if(su == 1) {
						System.out.println("요금 충전을 선택하셨습니다.");
						System.out.print("얼마 충전하시겠 습니까? : ");
						money += sc.nextInt();
						break;
					}else if(su==2) {
						System.out.println("메뉴로 돌아갑니다.");
						break;
					}else {
						System.out.println("잘못 입력하셨습니다. 메뉴로 돌아갑니다.");
						break;
					}
				}else {
					System.out.println("맛있게 드세요~!\n");
					money-=cof;
					break;
				}
			case 2:
				if(money<coco) {
					System.out.print("요금이 부족합니다.\n잔액 충전하시겠습니까? 1.Y 2.N\n>>>");
					su = sc.nextInt();
					if(su == 1) {
						System.out.println("요금 충전을 선택하셨습니다.");
						System.out.print("얼마 충전하시겠 습니까? : ");
						money += sc.nextInt();
						break;
					}else if(su==2) {
						System.out.println("메뉴로 돌아갑니다.");
						break;
					}else {
						System.out.println("잘못 입력하셨습니다. 메뉴로 돌아갑니다.");
						break;
					}
				}else {
					System.out.println("맛있게 드세요~!\n");
					money -= coco;
					break;
				}
			case 3:
				System.out.println("거스름돈 : " + money + "원 입니다.");
				money = 0;
				break;
			case 4:
				break;
			
			default :
				System.out.println("메뉴선택 오류!!! 다시 메뉴로 돌아갑니다.");
			}
		}
		
		
	
		
		
		
	}
}
