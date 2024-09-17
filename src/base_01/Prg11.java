package base_01;

public class Prg11 {
	public static void main(String[] args)
	{
		int a=5;
		int b;
		b = ++a + ++a + ++a + a++ + --a + a-- + a-- + ++a + a++ + a--;
		System.out.println(a);
		System.out.print(b);
		
	}
}
