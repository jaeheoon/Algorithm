class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer;
        
        if (n == 1) {
            answer = new int[slicer[1] + 1];
            for (int i=0; i<=slicer[1]; i++) {
                answer[i] = num_list[i];
            }
        } else if (n == 2) {
            answer = new int[num_list.length - slicer[0]];
            for (int i=slicer[0]; i<num_list.length; i++) {
                answer[i - slicer[0]] = num_list[i];
            }
        } else if (n == 3) {
            answer = new int[slicer[1] - slicer[0] + 1];
            for (int i=slicer[0]; i<=slicer[1]; i++) {
                answer[i - slicer[0]] = num_list[i];
            }
        } else if (n == 4) {
            int count = (slicer[1] - slicer[0] + 1) / slicer[2];
            if ((slicer[1] - slicer[0] + 1) % slicer[2] != 0) {
                count++;
            }
            answer = new int[count];
            
            int index = 0;
            for (int i=slicer[0]; i<=slicer[1]; i+=slicer[2]) {
                answer[index++] = num_list[i];
            }
        } else {
            answer = new int[0];
        }
        
        return answer;
    }
}