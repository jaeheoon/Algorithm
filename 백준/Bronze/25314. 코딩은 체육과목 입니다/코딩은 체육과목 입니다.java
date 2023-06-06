import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String longByte = "long ";
		
		for (int i = 1; i < n/4; i++) {
			longByte += "long ";
		}
		System.out.println(longByte + "int");
		in.close();
	}
}
