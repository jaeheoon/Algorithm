class Solution {
    public int[] solution(int n) {
		int a = 1;
        if (n % 2 == 0) {
        	int[] answer = new int[n/2];
        	answer[0] = a;
        	for (int i = 1; i < n/2; i++) {
        		answer[i] = a+=2;
        	}
        	return answer;
		} else {
			int[] answer = new int[n/2 +1];
			answer[0] = a;
			for (int i = 1; i < n/2 +1; i++) {
        		answer[i] = a+=2;
			}
			return answer;
		}
	}
}