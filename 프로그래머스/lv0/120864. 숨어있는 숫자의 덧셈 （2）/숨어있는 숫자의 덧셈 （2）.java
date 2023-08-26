class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] a = my_string.split("[a-zA-Z]");
        for (int i = 0; i < a.length; i++) {
        	if (!a[i].isEmpty()) {
        		answer += Integer.parseInt(a[i]);
			}
		}
        return answer;
    }
}