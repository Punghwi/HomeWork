package day04;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int dice1=0, dice2=0, dice3=0, same=0;

		System.out.print("1번째 주사위 입력 : ");
		dice1 = sc.nextInt();
		System.out.print("2번째 주사위 입력 : ");
		dice2 = sc.nextInt();
		System.out.print("3번째 주사위 입력 : ");
		dice3 = sc.nextInt();

		same = (dice1+dice2+dice3)/3;

		if(dice1 == dice2 && dice2 == dice3 && dice3 == dice1) {
			System.out.println(10000+same*1000);

		}else if(dice1 == dice2 && dice1 != dice3) {
			System.out.println(1000+dice1*100);
		}else if(dice2 == dice3 && dice2 != dice1) {
			System.out.println(1000+dice2*100);
		}else if(dice3 == dice1 && dice3 != dice2) {
			System.out.println(1000+dice3*100);	

		}else if(dice1 > dice2 && dice1 > dice3) {
			System.out.println(dice1 * 100);
		}else if(dice2 > dice3 && dice2 > dice1) {
			System.out.println(dice2 * 100);
		}else if(dice3 > dice2 && dice3 > dice1) {
			System.out.println(dice3 * 100);
		}


		sc.close();
	}
}

