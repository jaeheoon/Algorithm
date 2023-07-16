class Solution {
    public int[] solution(int[] numbers, String direction) {
        int a = 0;
		int[] answer = new int[numbers.length];
			if (direction.equals("left")) {
				a = numbers[0];
				for (int i = 1; i < numbers.length; i++) {
					answer[i-1] = numbers[i];
				}
				answer[numbers.length-1] = a;
			} else if (direction.equals("right")){
				a = numbers[numbers.length-1];
				for (int i = 1; i < numbers.length; i++) {
					answer[i] = numbers[i-1];
				}
				answer[0] = a;
			}
        return answer;
    }
}