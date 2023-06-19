class Solution {
    public String solution(int[] numLog) {
        String n = "";
        for (int i = 0; i < numLog.length-1; i++) {
    		if (numLog.length != 0) {
    			switch (numLog[i]-numLog[i+1]) {
    			case -1: n += "w"; break;
    			case 1: n += "s"; break;
    			case -10: n += "d"; break;
    			case 10: n += "a"; break;
    			}
			}
		}
        return n;
    }
}