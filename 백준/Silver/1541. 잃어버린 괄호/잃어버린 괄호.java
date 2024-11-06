import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		int sum = Integer.MAX_VALUE;
		
		while(st.hasMoreTokens()) {
			int S = 0;
			
			StringTokenizer sst = new StringTokenizer(st.nextToken(), "+");
			
			while(sst.hasMoreTokens()) {
				S += Integer.parseInt(sst.nextToken());
			}
			
			if(sum == Integer.MAX_VALUE) sum = S;
			else sum -= S;
			
		}
		System.out.println(sum);
	}
}