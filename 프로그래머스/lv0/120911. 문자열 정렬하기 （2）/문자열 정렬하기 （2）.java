
import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String a;
        char[] b = new char[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
			a = my_string.toLowerCase();
			b[i] = a.charAt(i);
		}
        Arrays.sort(b);
        for (int i = 0; i < b.length; i++) {
        	answer += b[i];
		}
        return answer;
    }
}