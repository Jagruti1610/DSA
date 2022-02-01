// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/

import java.util.*;

class RemoveDuplicatesFromStringStack2 {


	
    public static void main(String [] args){

	
	RemoveDuplicatesFromStringStack2 rem = new RemoveDuplicatesFromStringStack2();
	String ss = rem.removeDuplicates("yfttttfbbbbnnnnffbgffffgbbbbgssssgthyyyy", 4);
	System.out.println("output2= "+ss);

    }

    public String removeDuplicates(String s, int k) {        
        
             Stack<String> stack = new Stack<String>();
		Map<String,Integer> count = new HashMap<String,Integer>();
        
        int c=1;
        String curr="", peek="", res="";
        
        for(int i=0; i<s.length(); i++)
        {
            curr = String.valueOf(s.charAt(i));

			Integer occur = count.get(curr);
			if (occur == null) {
				count.put(curr, 1);
                
			}
			else {
				count.put(curr, occur + 1);
			}
            
            //stack.push (curr);

        /*    if(peek.equals(curr))
            {
                c++;
            }
			else{
				c=1;
			}
			
            
            if(count.get(curr)==k)
            {
				int t=0;
                String toPush="";
                while(t<k)
                {
                    peek=stack.peek();
                    
                    if(peek==curr){
                        String pop = stack.pop();
                        t++;
                    }
                   
                }
				c=1; 
                int f = count.get(curr);
                count.put(curr, f-t);
			
				
            }     */       

        }
        
        for ( String key : count.keySet() ) 
        {

		System.out.println("key1= "+key);
            int freq = count.get(key);

		    if(freq>k)
		    {
		        count.put(key, freq-k);
		    }
		  
		    	

        }
        
        for ( String key : count.keySet() ) 
        {
            int freq = count.get(key);

            while(freq!=0)
            {
                stack.push(key);
                    
                    
            }

        }
        
        
        while(!stack.empty())
        {
            res=stack.pop()+res;
        }
        
        return res;
        
    }
}

