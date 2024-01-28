import java.util.Scanner;
 
public class Main {
    
	public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt(); 
		int M = scanner.nextInt();
		
		int[][] Aarray = new int [N][M];
		int[][] Barray = new int [N][M];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				Aarray[i][j] = scanner.nextInt();
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				Barray[i][j] = scanner.nextInt();
			}
		}
		
		int[][] result = new int [N][M];
		for(int i = 0; i < N; i++) {
			for(int j=0; j<M; j++) {
				result[i][j] = Aarray[i][j]+ Barray[i][j]; 
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
}