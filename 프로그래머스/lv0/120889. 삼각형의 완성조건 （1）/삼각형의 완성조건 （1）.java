class Solution {
    public int solution(int[] sides) {
        int a = sides[0], b = 0;
    	for (int i = 1; i <= sides.length-1; i++) {
			a = a > sides[i] ? a : sides[i];
		}
    	for (int j = 0; j < sides.length; j++) {
    		b += sides[j];
		}
    	return (b-a) > a ? 1 : 2;
    }
}