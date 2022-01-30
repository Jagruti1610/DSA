import java.util.*;

class RecamanSequence{
	    
	static List<Integer> list = new ArrayList<Integer>();


	public static void main(String [] args){
	
		list.clear();
		list.add(0);
		recman(1,0, 17,0, 0);
		System.out.println(list);		
	}

	public static void recman(int numToAdd, int num, int noOfTimes, int curr, int prev){


	
		System.out.print(num+" *** ");

		if(!list.contains(num))	
		{	
			list.add(num);
			System.out.println("added "+num+" in list >>   ");
			System.out.print(list);					
			//curr=curr+1;
		}


		
		if(noOfTimes==curr)
		{
			System.out.println(curr+" >>> if 0");		
			return;
		}
		
		if(prev>numToAdd)
		{

			num=prev-numToAdd;
			if(!list.contains(num))
			{
				//list.add(num);
				System.out.println(curr + " >>> if 1 >> prev= "+prev+ "  _______ calcu_____ "+prev +" - "+ numToAdd );		
				curr=curr+1;
			}
		}
		if(prev<=numToAdd)
		{	

			num=prev+numToAdd;
			if(!list.contains(num))	
			{	
				// list.add(num);
				System.out.println(curr+ " >>> if 2 >> prev= "+prev + "  _______ calcu_____ "+prev +" + "+ numToAdd );		
				curr=curr+1;
			}
		}


		recman(numToAdd, num ,noOfTimes,  curr, num);


		
	}
}


// add till you can otherwise subtract. 
// the list should not contain duplicate terms
