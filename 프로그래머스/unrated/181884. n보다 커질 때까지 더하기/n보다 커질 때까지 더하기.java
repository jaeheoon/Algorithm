class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
         int[] a = new int[numbers.length];
        for (int i = 0; i < a.length; i++) {
			a[i] = numbers[i];
		}
        for (int j = 0; j < a.length; j++) {
        	if (answer > n) {
        		return answer;
        	} else {
        		answer += a[j];
        	}
        }
        return answer;
    }
}