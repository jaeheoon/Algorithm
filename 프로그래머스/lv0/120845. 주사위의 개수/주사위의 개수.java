class Solution {
    public int solution(int[] box, int n) {
        int answer = (int)(((box[0]/n) * (box[1]/n) * (box[2]/n)));
        return answer;
    }
}