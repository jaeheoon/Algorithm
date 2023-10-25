class Solution {
    public int[] solution(int n, int m) {
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        while(min != 0){
            int a = max % min;
            max = min;
            min = a;
        }
        
        int b = n * m / max;
        
        int[] answer = {max, b};
        return answer;
    }
}