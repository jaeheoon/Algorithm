class Solution {
    public int solution(int n) {
        int answer = 0;
		for (int i = 1; i <= 10; i++) {
		    int fac = 1;
			for (int j = i; j >= 1; j--) {
				fac *= j;
			}
			if (fac <= n) {
				answer = i;
			}
		}
		return answer;
    }
}