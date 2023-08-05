class Solution {
    public String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].toLowerCase().equals("kim")) {
				return "김서방은 "+ i +"에 있다";
			} 
		}
        return "";
    }
}