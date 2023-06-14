class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
    	if ((number % n) + (number % m) == 0 ) {
			answer = 1;
		} else if ((number % n) + (number % m) >= 1 ){
			answer = 0;
		}
        return answer;
    }
}