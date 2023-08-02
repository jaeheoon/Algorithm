class Solution {
    public int[] solution(long n) {
        String a = String.valueOf(n);
        int[] answer = new int[a.length()];
        
        for (int i = 0; i < a.length(); i++) {
			answer[a.length() - i - 1] = Integer.valueOf(a.charAt(i)) - '0';
		}
        return answer;
    }
}