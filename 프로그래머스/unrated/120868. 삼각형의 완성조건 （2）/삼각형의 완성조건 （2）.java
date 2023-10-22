class Solution {
    public int solution(int[] sides) {
        int longLine = Math.max(sides[0], sides[1]);
        int shortLine = Math.min(sides[0], sides[1]);
        
        return (longLine + shortLine) - (longLine - shortLine) - 1;
    }
}