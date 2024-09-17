package base_01;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int n;
		
		// 5*1 , 5*2 , 
		System.out.println("Enter the n value");
		n = s1.nextInt();
		int fact = 1; 
	/*	for (int i = 1; i <= n; i++) {
			fact = fact * i;	
			//1
			//2
			//4
			//12
			//48
			//120
		}*/
		
		for (int i = n; i >=1; i--) {
			fact = fact * i;	
			//1
			//2
			//4
			//12
			//48
			//120
		}
		System.out.println( fact);
	}
}

