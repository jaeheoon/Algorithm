class Solution {
    public int solution(int n, int k) {
        int ch = 12000, dr = 2000;
        return (ch * n) - ((n / 10)*2000) + (dr * k);
    }
}