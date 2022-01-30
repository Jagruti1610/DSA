class RecursiveSum{

	public static void main(String [] args){
		
		int a = sum(1234, 0);
		System.out.println("sum = "+a);
		
	}

	public static int sum(int n, int s){
		
		if(n==0){
			return s;
		}
		s=s+n%10;
		return sum(n/10, s);
	}
}


