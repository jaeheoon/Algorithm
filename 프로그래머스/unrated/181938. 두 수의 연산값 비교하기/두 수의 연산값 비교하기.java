class Solution {
    public int solution(int a, int b) {
        int answer = 0;
    	String ret = null;
    	int ret2 = 0;
    	ret = "" + a + b;
    	ret2 = 2 * a * b;
    	if (Integer.valueOf(ret) > ret2) {
			answer = Integer.valueOf(ret);
		}else if(Integer.valueOf(ret) < ret2){
			answer = ret2;
		} else {
			answer = Integer.valueOf(ret);
		}
        return answer;
    }
}