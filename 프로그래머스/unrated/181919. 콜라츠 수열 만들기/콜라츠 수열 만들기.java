class Solution {
    public int[] solution(int n) {
        int count = 0;
		int b = n;
		boolean a = true;
		while (a) {
			if (n == 1) {
				a = false;
			} else if (n % 2 == 0) {
				n /= 2;
				count++;
			} else if (n % 2 == 1) {
				n = 3 * n + 1;
				count++;
			}
		}
        int[] answer = new int[count+1];
        answer[0] = b;
        for (int i = 1; i < answer.length; i++) {
        	if (b % 2 == 0) {
				b /= 2;
				answer[i] = b;
			} else if (b % 2 == 1) {
				b = 3 * b + 1;
				answer[i] = b;
			} 
		}
        return answer;
    }
}