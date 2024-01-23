import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num1 = sc.next();
		String num2 = sc.next();
		
        sc.close();
        
        char[] reNum1 = new char[3];
		char[] reNum2 = new char[3];
		
		int n = 0;
		
		for(int i = 2; i >= 0; i--) {
			reNum1[i] = num1.charAt(n);
			reNum2[i] = num2.charAt(n);
			n++;
		}
		
		int a = Integer.parseInt(new String(reNum1));
		int b = Integer.parseInt(new String(reNum2));
		
		System.out.println(a > b ? a : b);
	}
}
