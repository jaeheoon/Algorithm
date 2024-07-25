import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static int N, M, cnt;
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		Queue<Pair> qu = new LinkedList<>();
		int[][] arr = new int[N][M];   // 그래프 저장
		int[][] check = new int[N][M]; // 방문 정보 저장

		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = line.charAt(j);
				check[i][j] = -1; // 거리를 -1로 세팅하면, 방문여부를 확인가능.
			}
		}
		qu.offer(new Pair(0, 0)); // 시작점에 추가
		check[0][0] = 0; 		  // 첫 시작이니까 거리가 0이다.

		while (!qu.isEmpty()) {
			Pair p = qu.poll();

			// 상, 하, 좌, 우를 계산해준다.
			for (int i = 0; i < 4; i++) {
				int nX = p.x + dx[i];
				int nY = p.y + dy[i];

				// 벽에 부딪히거나, 범위를 넘어가면 PASS
				if (nX < 0 || nX >= N || nY < 0 || nY >= M) {
					continue;
				}
				// 길이 아니거나, 방문을 했다면 PASS
				if (arr[nX][nY] == '0' || check[nX][nY] != -1) {
					continue;
				}

				// 큐에 이동한 좌표를 넣어준다.
				qu.offer(new Pair(nX, nY));
				// 한칸 이동하였기 때문에, 이전 출발지점의 거리 +1을 해준다.
				check[nX][nY] = check[p.x][p.y] + 1;
			}
		}

		// 마지막 지점의 (거리 + 1)를 출력한다.
		System.out.print(check[N - 1][M - 1] + 1);
	}

	public static class Pair {
		int x, y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

		public void setX(int x) {
			this.x = x;
		}

		public void setY(int y) {
			this.y = y;
		}
	}
}