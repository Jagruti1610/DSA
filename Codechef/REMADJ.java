import java.io.*;
import java.util.*;

class REMADJ{


	public static void main(String args[]) throws IOException,NumberFormatException{
		
		BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

		int t =  Integer.parseInt(reader.readLine().replaceAll(" ",""));
		
		
		while(t>0)
		{
			int n = Integer.parseInt(reader.readLine().replaceAll(" ",""));
			int sum = 0 ;
			int[] prefix = new int[n];
			
			for(int i=0; i<n; i++){
				int k = Integer.parseInt(reader.readLine().replaceAll(" ",""));
				prefix[i]=	prefix[i]+k;
			}
			
			int max = prefix[n-1];
			
			if(max==0){
				
			}
			
			t--;		
		}	
			
	
	}
}

// https://www.codechef.com/FEB221C/problems/REMADJ
