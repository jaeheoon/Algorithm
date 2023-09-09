class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        String str = String.valueOf(k);
        for (int l=i; l<=j; l++) {
            String a = String.valueOf(l);
            if (a.contains(str)) {
                String[] array = a.split("");
                for (String b : array) {
                    if (b.equals(str)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}