import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length <= 1) return new int[] {-1};
        int min = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++) {
            list.add(arr[i]);
            if(min > arr[i]) min = arr[i];
        }

        list.remove(list.indexOf(min));
        int[] newArr = new int[list.size()];
        for(int i=0; i<newArr.length; i++) newArr[i] = list.get(i);

        return newArr;
    }
}