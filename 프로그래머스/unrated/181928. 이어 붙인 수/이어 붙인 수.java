class Solution {
    public int solution(int[] num_list) {
        int a = 0, b = 0;
    	String sa = "", sb ="";
    	
    	for (int i = 0; i < num_list.length; i++) {
    		if (num_list[i] % 2 == 1) {
    			sa += (num_list[i]);
			} else {
				sb += (num_list[i]);
			}
		}
    	a = Integer.valueOf(sa);
    	b = Integer.valueOf(sb);
        return a+b;
    }
}