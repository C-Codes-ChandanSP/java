package base_01;

public class Even_count_odd_count {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7};
		int  even_count = 0;
		int odd_count = 0;
		
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] % 2 ==0) {
				even_count++;
			}
			
			/*if (i % 2 ==0) {
				even_count++;
			}*/
			else
			{
				odd_count++;
			}
			
		}
		System.out.println("even count " +even_count);
		
		System.out.println("odd count " +odd_count);
	}
}
