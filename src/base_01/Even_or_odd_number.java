package base_01;

import java.util.Scanner;

public class Even_or_odd_number {
	public static void main(String[] args) {
	int	a;
	Scanner s = new Scanner(System.in);
	System.out.println("enter the number ");
	a = s.nextInt();
	if (a % 2 == 0) {
		System.out.println("Even number " +a);
	}
	else
		System.out.println("Odd number " +a);
	}
}
