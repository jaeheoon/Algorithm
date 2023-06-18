class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
       if(60 == ineq.charAt(0)){
            if(63 != eq.charAt(0))
            	answer = n <= m ? 1 : 0;
            else
            	answer = n < m ? 0 : 1;
        } else {
            if(63 != eq.charAt(0))
            	answer = n >= m ? 1 : 0;
            else
            	answer = n > m ? 0 : 1;
        }
        return answer;
    }
}