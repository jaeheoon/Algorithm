class Solution {
    public int solution(int slice, int n) {
        return (n+slice) % slice == 0 ? ((n+slice) / slice) - 1 : (n+slice) / slice;
    }
}