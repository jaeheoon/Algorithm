import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int X = in.nextInt();
 
		int count = 1;
        int sum = 0;
 
		while (true) {
			if (X <= sum + count) {	
				
				if (count % 2 == 1) {
					System.out.print((count - (X - sum - 1)) + "/" + (X - sum));
                    break;
				} 
				
				else {
					System.out.print((X - sum) + "/" + (count - (X - sum - 1)));
                    break;
				}
 
			} else {
				sum += count;
				count++;
			}
		}
	}
}