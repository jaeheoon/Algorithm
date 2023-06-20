class Solution {
    public int[] solution(int start, int end) {
        int[] numLog = new int[end-start+1];
		for (int i = 0; i < end-start+1; i++) {
			numLog[i] = i+start;
		}
        return numLog;
    }
}