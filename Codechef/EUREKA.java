import java.util.Scanner;
import java.lang.Math;


class EUREKA{

	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t>0)
		{			
			double n = in.nextInt();
			double p =  Math.pow(0.143*n, n);

			double f = Math.floor(p);

			if(p-f<0.5){
			  System.out.println((int)f);			

			}
			else{
			   System.out.println((int)f+1);			
			}
			
			t--;
		}
	}
}


// https://www.codechef.com/FEB221C/problems/EUREKA
