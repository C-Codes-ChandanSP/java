package base_01;

public class Fibanaci_series {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int count = 10;
		System.out.println("Fibo : ");
		
		System.out.println(num1);
		System.out.println(num2);
			for (int i = 2; i < count  ; i++) {
			int num3  = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
			}
			//0,1,1
			//1,1,2
			//1,2,3
			//2,3,5
			//3,5,7
	}
}
