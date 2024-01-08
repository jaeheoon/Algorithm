import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			
			while (a < b) {
				int c = arr[a];
				arr[a++] = arr[b];
				arr[b--] = c;
			}

		}
		String ret = "";
		for (int j = 0; j < arr.length; j++) {
			ret += arr[j] + " ";
		}
		System.out.print(ret.trim());
		sc.close();
	}
}