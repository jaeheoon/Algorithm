class Solution {
    public long solution(String numbers) {
        String[] enNum = {
                "zero", "one", "two"
                , "three", "four", "five"
                , "six", "seven", "eight", "nine"};

        for (int i = 0; i < enNum.length; i++) {
            numbers = numbers.replaceAll(enNum[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}