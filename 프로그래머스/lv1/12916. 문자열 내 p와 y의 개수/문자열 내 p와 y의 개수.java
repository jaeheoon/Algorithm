class Solution {
    boolean solution(String s) {
       int a=0, b=0;
        for (int i = 0; i < s.length(); i++) {
			if (s.toLowerCase().charAt(i) == 'p') {
				a++;
			} else if (s.toLowerCase().charAt(i) == 'y') {
				b++;
			}
		}
        if (a == b) {
        	return true;
		} else {
			return false;
		}
    }
}