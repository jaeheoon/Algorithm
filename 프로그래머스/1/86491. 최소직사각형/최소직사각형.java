class Solution {
    public int solution(int[][] sizes) {
        int wid = 0;
        int len = 0;
        
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            if(wid < sizes[i][0]){
                wid = sizes[i][0];
            }
            if(len < sizes[i][1]){
                len = sizes[i][1];
            }
        }
        
        return wid * len;
    }
}