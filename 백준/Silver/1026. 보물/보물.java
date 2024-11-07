import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Integer[] Aarr = new Integer[N];	//A
		Integer[] Barr = new Integer[N];	//B
		int answer = 0;
		
		//Array 넣어주기
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {	//A
			Aarr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {	//B
			Barr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(Aarr);	//A 정렬
		Arrays.sort(Barr, Collections.reverseOrder());	//B 오름차순 정렬
		
		for (int i = 0; i < N; i++) {
			answer += Aarr[i] * Barr[i];
		}
		System.out.println(answer);
	}
}