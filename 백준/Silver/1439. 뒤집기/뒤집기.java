import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		String[] arr = new String[S.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = S.charAt(i)+"";
		}
		int count = 0;
		
		for (int i = 1; i < S.length(); i++) {
			if(!arr[0].equals(arr[i])) {
				if(arr[i].equals(arr[i-1])) continue;
				else {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
