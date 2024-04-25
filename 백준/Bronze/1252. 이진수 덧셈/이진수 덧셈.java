import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();
		
		BigInteger Ay = new BigInteger(A, 2);
		BigInteger By = new BigInteger(B, 2);
        
		BigInteger sum = Ay.add(By);
		
		String sumY = sum.toString(2);
		
		System.out.println(sumY);
	}

}