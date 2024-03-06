import java.util.Scanner;
 
public class Main {
 
	public static boolean[][] arr;
	public static int min = 64;
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		int M = in.nextInt();
 
		arr = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			String str = in.next();
			
			for (int j = 0; j < M; j++) {
				if (str.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
 
			}
		}
		
		int NRow = N - 7;
		int MCol = M - 7;
 
		for (int i = 0; i < NRow; i++) {
			for (int j = 0; j < MCol; j++) {
				find(i, j);
			}
		}
		System.out.println(min);
	}
 
	
	public static void find(int x, int y) {
		int endX = x + 8;
		int endY = y + 8;
		int count = 0;
 
		boolean TF = arr[x][y];
 
		for (int i = x; i < endX; i++) {
			for (int j = y; j < endY; j++) {
 
				if (arr[i][j] != TF) {	
					count++;
				}
				
				TF = (!TF);
			}
			
			TF = !TF;
		}
		
		count = Math.min(count, 64 - count);
		
		min = Math.min(min, count);
	}
}