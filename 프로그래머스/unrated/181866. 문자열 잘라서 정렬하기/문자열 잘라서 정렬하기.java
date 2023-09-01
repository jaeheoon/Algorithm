import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] splitArr = myString.split("x");
		ArrayList<String> resultList = new ArrayList<>();

		for (String a : splitArr) {
			if (!a.isEmpty()) {
				resultList.add(a);
			}
		}

		String[] resultArr = resultList.toArray(new String[resultList.size()]);
		Arrays.sort(resultArr);

		return resultArr;
    }
}