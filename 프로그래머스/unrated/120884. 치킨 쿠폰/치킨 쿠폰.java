class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int bonus = 10;
        while (chicken >= bonus) {
            int newChick = chicken / bonus;
            int restChick = chicken % bonus;
            
            chicken = newChick + restChick;
            answer += newChick;
        }

        return answer;
    }
}