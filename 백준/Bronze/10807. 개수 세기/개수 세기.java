import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt();

        for(int j = 0; j < arr.length; j++){
            if(b == arr[j]){
                count++;
            }
        }
        System.out.println(count);
    }
}