class Solution {
    public int solution(int n) {
        int y = 1;
        boolean ok = true;
        while (ok) {
			if ((y*6) % n != 0) {
				y++;
			} else {
				ok = false;
			}
		}
        return y;
    }
}