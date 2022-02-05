import java.io.*;
import java.lang.Math;


class BINBASBASIC{

	public static void main (String args[])throws  IOException
	{
		
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 	
			int t = Integer.parseInt(in.readLine());
			
			while(t>0)
			{			
				int n = Integer.parseInt(in.readLine());
				int k = Integer.parseInt(in.readLine());
				String s = in.readLine();
				int c=0;
				
				for(int i=0, j=n-1; i<n && j>0; i++,j--){
					if(s.charAt(i)!=s.charAt(j)){
						c++;
					}
					
				}
				
				if(c<=k)
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

// https://www.codechef.com/FEB221C/problems/BINBASBASIC