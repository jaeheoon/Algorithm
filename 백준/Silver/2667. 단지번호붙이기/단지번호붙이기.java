import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static boolean[][] visited;
	static int[][] arr;
	static int N;
	static int[] aparts;
	static int count = 0;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		visited = new boolean[N][N];
		arr = new int[N][N];
		aparts = new int[25*25];
		
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			for (int j = 0; j < N; j++) {
				arr[i][j] = input.charAt(j) - '0';
			}
		}
		
		for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(arr[i][j] == 1 && !visited[i][j]){
                    count++;
                    bfs(i, j);
                }
            }
        }
		
		Arrays.sort(aparts);
		System.out.println(count);
		
		for (int i = 0; i < aparts.length; i++) {
			if (aparts[i] == 0) {}
			else System.out.println(aparts[i]);
		}
		
	}
	
	public static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x, y});
		visited[x][y] = true;
		aparts[count]++;
		
		while (!q.isEmpty()) {
			int curX = q.peek()[0];
			int curY = q.peek()[1];
			q.poll();
			
			for (int i = 0; i < 4; i++) {
				int nx = curX + dx[i];
				int ny = curY + dy[i];
				
				if (nx>=0 && ny>=0 && nx<N && ny<N) {
					if (arr[nx][ny] == 1 && !visited[nx][ny]) {
						q.add(new int[] {nx, ny});
						visited[nx][ny] = true;
						aparts[count]++;
					}
				}
			}
		}
	}
}