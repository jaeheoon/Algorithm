class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String[] a = String.valueOf(num).split("");
        
        for(int i=0; i<a.length; i++){
            if(a[i].equals(String.valueOf(k))){
                answer = i+1;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}