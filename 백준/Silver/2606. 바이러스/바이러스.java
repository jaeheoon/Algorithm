import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static boolean[] checked;
	static int[][] arr;
	static int N;
	static int M;
	
	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		checked = new boolean[N+1];
		arr = new int[N+1][N+1];
		
		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = arr[b][a] = 1;
		}
		dfs(1);
		
		System.out.println(count-1);
		
	}
	public static void dfs(int start) {
		checked[start] = true;
		count++;
		for (int i = 0; i <= N; i++) {
			if (arr[start][i] == 1 && !checked[i]) {
				dfs(i);
			}
		}
	}
}