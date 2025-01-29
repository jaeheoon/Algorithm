import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		        
		String answer = "";
		String A = "AAAA", B = "BB";
		
		s = s.replaceAll("XXXX", A);
		answer = s.replaceAll("XX", B);
		
		if(answer.contains("X")) {
			answer = "-1";
		}
		
		System.out.println(answer);
	}
}
