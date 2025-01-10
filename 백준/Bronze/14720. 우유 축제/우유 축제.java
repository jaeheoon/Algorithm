import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        int answer = 0;
        int choice = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        String[] store = bufferedReader.readLine().split(" ");
        
        for (int i = 0 ; i < N ; i++) {
            int milk = Integer.parseInt(store[i]);

            if (milk == choice) {
                answer += 1;
                choice += 1;
                if (choice == 3) {
                    choice = 0;
                }
            }
        }
        
        System.out.println(answer);
    }
}