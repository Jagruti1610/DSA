import java.util.*;

class RecamanSequenceWithLoop{


	public static void main(String [] args){

		RecamanSequenceWithLoop obj= new RecamanSequenceWithLoop();
		obj.recaman(17);
	}
	
	public void recaman(int n){

		List<Integer> arr = new ArrayList<Integer>();
		int num=0, prev=0, c=n, numberToAdd=1;

		arr.add(0);
		
		while(n>0)
		{

			num = prev-numberToAdd;

	
			if(num<0 || arr.contains(num)){

				num=prev+numberToAdd;				
			}

			arr.add(num);

			prev=num;
			numberToAdd++; 
			n--;
		}

		System.out.println("arr= "+arr);

	}

}
