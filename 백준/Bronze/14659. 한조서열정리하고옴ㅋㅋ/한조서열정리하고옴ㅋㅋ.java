import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int j = 0; j < N; j++) {
			int i = j;
			int a = arr[j];
			int count = 0;
			while(i<N) {
				if(i == N-1) break;
				else if(a > arr[++i]) {
					count++;
					max = (count > max) ? count : max;
				} else {
					max = (count > max) ? count : max;
					break;
				}
			}
			
		}
		System.out.println(max);
	}
}
