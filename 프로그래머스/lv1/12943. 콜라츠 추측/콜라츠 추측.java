class Solution {
    public int solution(long num) {
        int answer = 0;
        if (num == 1) {
        	return 0;
        }
        while(num > 1){
            if(num == 1){
            	return answer;
            } else if (answer > 500) {
            	return -1;
            } else if (num % 2 == 1) {
            	num = (num*3)+1;
            	answer++;
            } else if (num % 2 == 0) {
            	num /= 2;
            	answer++;
            }
        }
        return answer;
    }
}