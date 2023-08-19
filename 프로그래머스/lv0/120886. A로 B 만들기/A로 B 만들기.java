import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        char[] beforeArray = before.toCharArray();
        char[] afterArray = after.toCharArray();
        
        Arrays.sort(beforeArray);
        Arrays.sort(afterArray);
        
        String a = new String(afterArray);
        String b = new String(beforeArray);
        
        return a.equals(b) ? 1 : 0;
    }
}