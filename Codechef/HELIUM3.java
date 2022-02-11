import java.io.*;
import java.util.*;

class HELIUM3{


	public static void main(String args[]) throws IOException,NumberFormatException{
		
		BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

		int t =  Integer.parseInt(reader.readLine().replaceAll(" ",""));
		
		
		while(t>0)
		{
			int A =  Integer.parseInt(reader.readLine().replaceAll(" ",""));
			int B =  Integer.parseInt(reader.readLine().replaceAll(" ",""));
			int X =  Integer.parseInt(reader.readLine().replaceAll(" ",""));
			int Y =  Integer.parseInt(reader.readLine().replaceAll(" ",""));
		
			int val1 = A*B;
			int val2 = X*Y;
			
			if(val2 >= val1)
			{
				System.out.println("YES");
			}
			else{
				System.out.println("NO");

			}
			t--;		
		}	
			
	
	}
}

// https://www.codechef.com/FEB222C/problems/HELIUM3
