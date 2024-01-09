import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int busket = sc.nextInt(); 
		int count = sc.nextInt(); 
		
		int n1, n2, ball = 0; 
		
		int[] array1 = new int[busket]; 
		
		for(int i = 0; i < count; i++) { 
			n1 = sc.nextInt() - 1;  
			n2 = sc.nextInt() - 1; 
			ball = sc.nextInt();
			
			for(int j = n1; j <= n2; j++) { 
				array1[j] = ball;
			}
		}
		sc.close();
		
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array1[i]+" ");
		}
		
	}
}