class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] bins = binomial.split(" ");
        
        int a = Integer.parseInt(bins[0]);
        String op = bins[1];
        int b = Integer.parseInt(bins[2]);
        
        if (op.equals("+")) {
            answer = a + b;
        } else if (op.equals("-")) {
            answer = a - b;
        } else if (op.equals("*")) {
            answer = a * b;
        }
        
        return answer;
    }
}