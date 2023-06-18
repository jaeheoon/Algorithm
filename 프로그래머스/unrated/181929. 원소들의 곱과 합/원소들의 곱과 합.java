class Solution {
    public int solution(int[] num_list) {
        int a = 0, b = 1;
    	for (int i : num_list) {
			a += i;
		}
    	for (int i = 0; i < num_list.length; i++) {
			b = b * num_list[i];
		}
    	if ((a*a)>b) {
			return 1;
		} else {
			return 0;
		}
    }
}