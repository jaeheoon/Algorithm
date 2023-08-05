import java.util.*;

class Solution {
    public long solution(long n) {
        String a = String.valueOf(n);
        String answer = "";
        Character[] b = new Character[a.length()];
        for (int i = 0; i < a.length(); i++) {
			b[i] = a.charAt(i);
		}
        Arrays.sort(b, Collections.reverseOrder());
        for (char c : b) {
        	answer += c;
		}
        return Long.valueOf(answer);
    }
}