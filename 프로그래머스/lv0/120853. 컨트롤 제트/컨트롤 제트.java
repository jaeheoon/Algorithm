class Solution {
    public int solution(String s) {
        String[] a = s.split(" ");
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("Z")) {
                answer -= Integer.parseInt(a[i - 1]);
                continue;
            }
            answer += Integer.parseInt(a[i]);
        }
        return answer;
    }
}