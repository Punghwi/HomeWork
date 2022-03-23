package day06;

public class Quiz01 {

	public static void main(String[] args) {
		
		System.out.println("======1번 문제======");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++ ) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}
		
		System.out.println("======2번 문제======");
//		for(int i=1; i<=1; i++) {
//			for(int j=1; j<=25; j++) {
//				System.out.print(i*j + "\t");
//				if(j%5 == 0) {
//					System.out.println();
//				}
//			}
//		}
		int sum=0;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				sum += 1;
				System.out.print(sum + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}
}
