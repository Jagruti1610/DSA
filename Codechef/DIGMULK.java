import java.io.*;


class DIGMULK{


	public static void main(String args[]) throws IOException,NumberFormatException{
		
		BufferedReader reader  =new BufferedReader(new InputStreamReader(System.in));

		int t =  Integer.parseInt(reader.readLine().replaceAll(" ",""));
		
		long M = 1000000007;
		
		while(t>0)
		{
			
			int n = Integer.parseInt(reader.readLine().replaceAll(" ",""));
			int k = Integer.parseInt(reader.readLine().replaceAll(" ",""));
			int m = Integer.parseInt(reader.readLine().replaceAll(" ",""));
			String s = reader.readLine().replaceAll(" ","");
			StringBuffer sb = new StringBuffer(s);  
			StringBuffer resStr = new StringBuffer();  

			int res = 0;

			
			while(m>0){
						
				long val = 0;
				
				for(int i=0; i<sb.length();i++){
					val= (Integer.parseInt(String.valueOf(sb.charAt(i)))*k)%M;
					resStr.append(val);
				}
				
				
				if(resStr.length()>res)
				{
					res=resStr.length();
				}
				
				sb.setLength(0);
				sb.append(resStr);
				resStr.setLength(0);
				
				m--;
			}			
			
			System.out.println(res);

			t--;		
		}	
			
	
	}
}

// https://www.codechef.com/FEB221C/problems/DIGMULK