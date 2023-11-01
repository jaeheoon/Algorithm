class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i=0; i<s.length(); i++){
            if(i != 0){
                int count = s.substring(0, i).lastIndexOf(s.charAt(i));
                if(count != -1){
                    answer[i] = i-count;
                }
                else {
                    answer[i] = count;
                }
            }
            else{
                answer[i] = -1;
            }
        }
        return answer;
    }
}