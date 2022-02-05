import java.util.Scanner;

class CHEFBARBER{

	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t>0)
		{
			int m = in.nextInt();
			int n = in.nextInt();
			System.out.println(m*n);			
			t--;
		}
	}
}


// https://www.codechef.com/FEB221C/problems/CHEFBARBER
