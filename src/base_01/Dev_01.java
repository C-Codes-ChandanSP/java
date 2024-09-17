package base_01;

public class Dev_01 {
	
	
public static void main(String[] args) {
	String s1 = "asj";
	//String s2 = s1.toUpperCase();
	s1.toUpperCase();
	StringBuffer s3 = new StringBuffer(s1);
	s3.toString().toUpperCase();
	//System.out.println(s3.toString().toUpperCase());
	System.out.println("ENter = " +s1+ " append");
}
}
