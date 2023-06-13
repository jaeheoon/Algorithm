class Solution {
    public int solution(int a, int b) {
        int answer = 0;
    	String ret = null;
    	String ret2 = null;
    	ret = "" + a + b;
    	ret2 = "" + b + a;
    	    if (Integer.valueOf(ret) > Integer.valueOf(ret2)) {
		    	answer = Integer.valueOf(ret);
	    	}else if(Integer.valueOf(ret) < Integer.valueOf(ret2)){
		    	answer = Integer.valueOf(ret2);
		    } else {
		    	answer = Integer.valueOf(ret);
		    }
        return answer;
    }
}