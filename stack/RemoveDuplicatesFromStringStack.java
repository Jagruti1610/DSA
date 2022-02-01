// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/

import java.util.*;

class RemoveDuplicatesFromStringStack {


	
    public static void main(String [] args){

	
	RemoveDuplicatesFromStringStack rem = new RemoveDuplicatesFromStringStack();
	String ss = rem.removeDuplicates("yfttttfbbbbnnnnffbgffffgbbbbgssssgthyyyy", 4);
	System.out.println("output= "+ss);

    }

    public String removeDuplicates(String s, int k) {        
        
        Stack<String> stack = new Stack<String>();
		Map<String,Integer> count = new HashMap<String,Integer>();
        
        int c=1;
        String curr="", peek="", res="";
        
        for(int i=0; i<s.length(); i++)
        {
            curr = String.valueOf(s.charAt(i));


            if(!stack.isEmpty())
            {
                // to prevent exception in case of empty stack
                peek=stack.peek();

            }
			
			Integer occur = count.get(curr);
			if (occur == null) {
				count.put(curr, 1);
			}
			else {
				count.put(curr, occur + 1);
			}
            
            if(peek.equals(curr))
            {
                c++;
				stack.push (curr);


            }
			else{
				c=1;
				stack.push (curr);
			}
			
            
            if(count.get(curr)==k)
            {
				int t=0;
                while(t<k)
                {
					String pop = stack.pop();
					
					System.out.println("  pop ==  "+pop +"  " + "i sub val=  "+ i + "  map val= "+count.get(curr)	);	
                    t++;
                }
				c=1; count.put(curr, 0);
			
				
            }
			
			System.out.println("c= "+c +" >>>>>>  i= "+i);
            

        }
        
        
        while(!stack.empty())
        {
            res=stack.pop()+res;
        }
        
        return res;
        
        
    }
}
