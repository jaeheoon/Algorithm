import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int a = 0;
		
		for (int i = 1; i < 10; i++) {
			a = H * i;
			System.out.println(H +" * "+i + " = " + a );
		}
		
		in.close();
	}
}