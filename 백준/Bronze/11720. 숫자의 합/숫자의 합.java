import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str = sc.next();
        int sum = 0;
        sc.close();

        for(int i = 0; i < a; i++){
            sum += str.charAt(i) - 48;
        }
        System.out.print(sum);
    }
}