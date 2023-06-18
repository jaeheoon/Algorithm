class Solution {
    public int solution(int a, int d, boolean[] included) {
        int sum = 0, sumArray = 0;
    	int[] re = new int[included.length];
    	
		sumArray = a;
		for (int i = 0; i < included.length; i++) {
			re[i] = sumArray;
			sumArray += d;
		}
		for (int i = 0; i < included.length; i++) {
			if (included[i]) {
				sum += re[i];
			} 
		}
        return sum;
    }
}