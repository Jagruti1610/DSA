class FinalValueAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
    	int val = 0;
    	for(int i=0;i<operations.length;i++) {
    		if(operations[i].charAt(1)=='+') val++;
    		else val--;
    	}
    	return val;        
    }
}

// Better solution than my Brute force approach
// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/discuss/1473083/Simple-java-and-java-8-Solution

