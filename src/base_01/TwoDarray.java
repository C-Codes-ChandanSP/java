package base_01;
import java.util.*;
public class TwoDarray {
	public static void main(String[] args) {
		int[][] ar = new int[2][3];
		Scanner s = new Scanner(System.in);
//		ar[0][0] = 20;
//		ar[0][1] = 21;
//		ar[0][2] = 23;
//		ar[1][0] = 24;
//		ar[1][1] = 25;
//		ar[1][2] = 26;
		for(int i=0;i<ar.length-1;i++) {
			for(int j=i;j<ar[i].length-1;j++)
			{
				ar[i][j] = s.nextInt(); 
			}
		}
		for(int i=0;i<ar.length-1;i++) {
			for(int j=i;j<ar[i].length-1;j++)
			{
				System.out.println(ar[i][j]);
			}
		}
	}

}
