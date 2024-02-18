import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int a;
        int count = 0;
        for(int i = 0; i < num; i++){
            a = input.nextInt();
            for(int j = 2; j <= a; j++){
                if(j == a){
                    count++;
                }
                if(a % j == 0){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}