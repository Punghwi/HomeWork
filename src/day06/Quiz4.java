package day06;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		

		int n = 4;
		
		for (int i=1; i<=5; i++){
			for(int j=n; j>0; j--){
				System.out.print(" ");
			}
			for(int k=i; k>0; k--){
				System.out.print("*");
			}
			System.out.println();
			n--;
		}
		
		int i,j=0;
	      
	    for(i=5; i>0; i--) {
	       for(j=1; j<=i-1; j++) {
	          System.out.print(" ");
	       }
	       for(j=1; j<=6-i; j++) {
	          System.out.print("*");
	       }
	       System.out.println();
	    }
		
	    System.out.println("    *");
	    System.out.println("   **");
	    System.out.println("  ***");
	    System.out.println(" ****");
	    System.out.println("*****");
		

		
	}
}
