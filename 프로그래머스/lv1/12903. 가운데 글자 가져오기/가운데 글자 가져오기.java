class Solution {
    public String solution(String s) {
        String answer = "";
		if(s.length() % 2 == 0) {
			for(int i=0; i<2; i++){
				answer += s.charAt((s.length()/2)-1 + i);
        	}
		} else {
			answer += s.charAt(s.length()/2);
        }
        return answer;
    }
}