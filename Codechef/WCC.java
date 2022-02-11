import java.io.*;
import java.util.*;

class WCC{


	public static void main(String args[]) throws IOException,NumberFormatException{
		

			FastReader sc = new FastReader();
			int t = sc.nextInt();
			
			while(t>0)
			{
				int X =  sc.nextInt();
				int cntC=0;
				int cntN=0;
			
				
				String s =  sc.next();
				
				for(int i=0; i<s.length(); i++){

					 
					 if(String.valueOf(s.charAt(i)).equals("C"))
					 {
						 cntC++;
						 cntC++;

					 }
					 
					 if(String.valueOf(s.charAt(i)).equals("D"))
					 {
						 cntC++;
						 cntN++;

					 }

					if(String.valueOf(s.charAt(i)).equals("N"))
					 {
						 cntN++;
						 cntN++;

					 }

				}
				
				if(cntC>cntN)
				{
					System.out.println(60*X);
				}
				else if(cntC<cntN)
				{
					System.out.println(40*X);

				}
				else if(cntC==cntN)
				{
					System.out.println(55*X);

				}
				
				t--;		
			}	
			
	
	}
	
	static class FastReader{
		BufferedReader bf;
		StringTokenizer st=new StringTokenizer("");
		FastReader(){bf= new BufferedReader(new InputStreamReader(System.in));}
		String next() {
			while(!st.hasMoreTokens()) 
				try {
					st=new StringTokenizer(bf.readLine());
				}
			   catch(IOException e){
				   e.printStackTrace();
			   }
			return st.nextToken();
		}
		int nextInt(){return Integer.parseInt(next());}	
	}
}

// https://www.codechef.com/FEB222C/problems/WCC
