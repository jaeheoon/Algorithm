class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] reset = {0, 0};
        
        for (int i = 0; i < keyinput.length; i++){
            if(keyinput[i].equals("up")) reset[1] += reset[1] < (board[1] / 2) ? 1 : 0;
            else if(keyinput[i].equals("down")) reset[1] -= reset[1] > -(board[1] / 2) ? 1 : 0;
            else if(keyinput[i].equals("right")) reset[0] += reset[0] < (board[0] / 2) ? 1 : 0;
            else if(keyinput[i].equals("left")) reset[0] -= reset[0] > -(board[0]/2) ? 1 : 0;
        }
        return reset;
    }
}