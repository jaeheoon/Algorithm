class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            if (query[2] == 0) {
                if (query[0] == 0) arr[0]++;
                continue;
            }

            int i = query[0] / query[2] * query[2];
            if (query[0] % query[2] != 0) i += query[2];

            while (i <= query[1]) {
                arr[i]++;
                i += query[2];
            }
        }
        return arr;
    }
}