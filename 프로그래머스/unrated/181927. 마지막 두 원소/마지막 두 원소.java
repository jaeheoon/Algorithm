class Solution {
    public int[] solution(int[] num_list) {
        int[] num_list2 = new int[num_list.length+1];
    	int a = 0;
    	
    	for (int j = 0; j < num_list.length; j++) {
    		num_list2[j] = num_list[j];
    	}
    	for (int i = 0; i < num_list.length; i++) {
    		if (num_list.length-1 == i) {
    			if (num_list[i] > num_list[i-1]) {
					a = num_list[i] - num_list[i-1];
					num_list2[i+1] = a;
				} else if (num_list[i] <= num_list[i-1]){
					a = num_list[i] * 2;
					num_list2[i+1] = a;
				}
			}
		}
        return num_list2;
    }
}