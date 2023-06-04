import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int D1 = in.nextInt();
		int D2 = in.nextInt();
		int D3 = in.nextInt();
		int count = 0;
		
		if (D1 == D2) {
			if (D2 == D3) {
				System.out.println(10000+D1*1000);
				return;
			}
			System.out.println(1000+D1*100);
		} else if(D1 == D3) {
			if (D2 == D3) {
				System.out.println(10000+D1*1000);
				return;
			}
			System.out.println(1000+D1*100);
		} else if(D2 == D3) {
			if (D1 == D3) {
				System.out.println(10000+D1*1000);
				return;
			}
			System.out.println(1000+D2*100);
		} else {
			count = (D1>D2) ? D1:D2;
			count = (count>D3) ? count:D3;
			System.out.println(count*100);
		}
		in.close();
	}
}