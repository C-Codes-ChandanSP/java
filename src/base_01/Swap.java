package base_01;

public class Swap {
public static void main(String[] args) {
	int a =5;
	int b=4;
	/*int temp;
	//with temp variable
	temp = a; // 5
	a=b; //4
	b = temp; //5
	
	System.out.println("a" + a);
	System.out.println("b"+b);*/
	
	// without using third variable
	
	a = a+b; // 5 + 4 = 9
	b= a-b; // 9-4 =5
	a= a-b; // 9 -5 = 4
	System.out.println("a = " + a);
	System.out.println("b = "+b);	
}
}
