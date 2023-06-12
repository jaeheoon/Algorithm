class Solution {
    public static String solution(String str1, String str2) {
    	int leng = str1.length();
    	String answer = "";
    	for (int i = 0; i < leng; i++) {
    		answer += (char)(str1.charAt(i));
    		answer += (char)(str2.charAt(i));
		}
        return answer;
    }
}