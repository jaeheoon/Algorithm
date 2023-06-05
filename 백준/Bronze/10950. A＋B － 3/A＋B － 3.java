import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int sum[] = new int[t];
		
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			sum[i] = a + b;
		}
		
		for (int i : sum) {
			System.out.println(i);
		}
		in.close();
	}
}