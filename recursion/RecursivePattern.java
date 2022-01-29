import java.io.*;
import java.util.*;

class RecursivePattern{
	
	static ArrayList<Integer> valList = new ArrayList<Integer>();

	public static void main(String args[]) throws IOException,NumberFormatException{
		
		BufferedReader reader  =new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(reader.readLine().replaceAll(" ",""));


		valList.clear();
		valList.add(n);
		valList.add(recPattern(n-5,1));	
		System.out.println(valList);	
			
	}


	public static int recPattern(int n, int c)
	{
		if(n==0)
		{
			// System.out.print(n+" ");
			valList.add(n);
			return recPattern(n+5, (--c)*-1);

		}
		if(n<0)
		{
			// System.out.print(n+" ");
			valList.add(n);			
			return recPattern(n+5,  (--c)*-1);
		}

		if(c<0)
		{
			// System.out.print(n+" ");
			valList.add(n);			
			return recPattern(n+5, c+1);
		}

		if(c>0)
		{
			// System.out.print(n+" ");
			valList.add(n);			
			return recPattern(n-5, c+1);
		}
		
		if(c==0)
		{	
			// System.out.print(n+" ");

		}

		return n;

	}


}
