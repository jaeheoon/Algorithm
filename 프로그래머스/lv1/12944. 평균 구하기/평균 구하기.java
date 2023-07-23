class Solution {
    public double solution(int[] arr) {
        double a = 0;
        for(int i = 0; i < arr.length; i++){
            a += arr[i];
        }
        return a / arr.length;
    }
}