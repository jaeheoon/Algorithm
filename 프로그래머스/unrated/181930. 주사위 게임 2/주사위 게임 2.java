class Solution {
    public int solution(int a, int b, int c) {
        int sum = 0;
    	if ((a == b && a != c ) || (a == c && a != b ) || (b == c && a != c) ) {
    		sum = (a + b + c) * ( (a*a) + (b*b) + (c*c) );
		} else if (a == b && b == c) {
			sum = (a + b + c) * ( (a*a) + (b*b) + (c*c) ) * ( (a*a*a) + (b*b*b) + (c*c*c) );
		} else {
			sum = a + b + c;
		}
        return sum;
    }
}