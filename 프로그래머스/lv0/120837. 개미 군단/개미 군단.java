class Solution {
    public int solution(int hp) {
        int answer = 0;
        boolean ok = true;
        while (ok) {
        	if (hp >= 5) {
				hp -= 5;
				answer++;
			} else if (hp >= 3){
				hp -= 3;
				answer++;
			} else if (hp >= 1) {
				hp -= 1;
				answer++;
			} else {
				ok = false;
			}
		}
        return answer;
    }
}