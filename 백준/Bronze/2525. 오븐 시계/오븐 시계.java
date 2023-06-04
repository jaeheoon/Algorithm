import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int M = in.nextInt();
		int Cooking = in.nextInt();
		
		H += Cooking / 60;
		M += Cooking % 60;
		
		if(M >= 60) {
			H++; M -= 60;
		}
		
		if (H >= 24) {
			H -= 24;
		} 
		System.out.println(H +" "+M);
		in.close();
	}
}