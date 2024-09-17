package base_01;

public class Palindrome {
	public static void main(String[] args) {
		String s = "mom";
		char ar[] = s.toCharArray();
		String s2_reverse ="";
		for (int i = ar.length-1; i >= 0 ; i--) {
			s2_reverse += ar[i]; 
		}
		if(s.equals(s2_reverse)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
		
		
	}
}
