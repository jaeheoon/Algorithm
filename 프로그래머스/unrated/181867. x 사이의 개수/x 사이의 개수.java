class Solution {
    public int[] solution(String myString) {
        String[] a = myString.split("x", -1);
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i].length();
        }

        return b;
    }
}