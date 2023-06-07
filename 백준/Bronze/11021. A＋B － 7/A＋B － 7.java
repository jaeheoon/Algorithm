import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			sum = a+b;
			System.out.println("Case #"+i+": "+ sum);
		}
		
	}
}
