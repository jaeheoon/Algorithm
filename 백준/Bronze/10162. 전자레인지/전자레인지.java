import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int A = 300;
		int B = 60;
		int C = 10;
		int countA = 0;
		int countB = 0;
		int countC = 0;
		
		if(T%10 > 0) {
			System.out.println(-1);
			return;
		}
		
		while(T >= 0) {
			if(T-A >= 0) {
				T -= A;
				countA++;
				continue;
			} else if(T-B >= 0) {
				T -= B;
				countB++;
				continue;
			} else if(T-C >= 0) {
				T -= C;
				countC++;
				continue;
			} else break;
		}
		if(countA+countB+countC > 0) System.out.println(countA + " " + countB + " " + countC);
		else System.out.println(-1);
	}
}