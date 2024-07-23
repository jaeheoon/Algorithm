import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static boolean[] check;		//방문 정보 저장
	static int[][] arr; 		//그래프 저장
	static StringBuilder sb = new StringBuilder();
	static int node, line, start;
	static Queue<Integer> q = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		node = Integer.parseInt(st.nextToken());
		line = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());
		
		arr = new int[node+1][node+1];
		check = new boolean[node+1];
		for (int i = 0; i < line; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			
			arr[a][b] = arr[b][a] = 1;		//양방향 그래프이기 때문에 둘 다 1을 넣어준다
		}
		dfs(start);
		sb.append("\n");
		
//		bfs 새로 출발해야하니 check 다시 생성
		check = new boolean[node+1];
		bfs(start);
		System.out.println(sb);
	}
	
	public static void dfs(int start) {
		check[start] = true;	//방문 정보 저장
		sb.append(start + " ");
		
		for (int i = 0; i <= node; i++) {
			if(arr[start][i] == 1 && !check[i])
				dfs(i);
		}
	}
	
	public static void bfs(int start) {
		q.add(start);
		check[start] = true;
		
		while (!q.isEmpty()) {
			start = q.poll();
			sb.append(start + " ");
			
			for (int i = 1; i <= node; i++) {
				if (arr[start][i] == 1 && !check[i]) {
					q.add(i);
					check[i] = true;
				}
			}
		}
	}
	
}