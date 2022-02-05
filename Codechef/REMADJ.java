import java.io.*;
import java.util.*;

class REMADJ{


	public static void main(String args[]) throws IOException,NumberFormatException{
		
		BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

		int t =  Integer.parseInt(reader.readLine().replaceAll(" ",""));
		
		
		while(t>0)
		{
			int n = Integer.parseInt(reader.readLine().replaceAll(" ",""));
			int num=0;
			int isEqual=1;
			int prev=Integer.parseInt(reader.readLine().replaceAll(" ",""));
			int sum=prev;
			int max=prev;

			
			for(int i=0; i<n-1; i++){
				
				int input= Integer.parseInt(reader.readLine().replaceAll(" ",""));
				//
				sum = sum + input;
				if(input>max)
					max=input;
				if(input!=prev)
					isEqual=0;
				
				prev=input;		
			

			}
			
			
			if(n==2)
			{
				System.out.println("1");
				return;
			}
		
			sum = sum - max;
			
			if(isEqual==1){
				// means all elements are equal;

				System.out.println(0);
			}
			else{

				System.out.println(sum/max);

			}

			t--;		
		}	
			
	
	}
}

// https://www.codechef.com/FEB221C/problems/REMADJ
