import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
        bw.write(solution(arr));
        bw.flush();
        bw.close();
    }

    static String solution(int[] stack) {
        int orderValue = 1;
        int[] tmpArr = new int[stack.length];
        int top = -1;

        for (int i = 0; i < stack.length; i++) {
            if (stack[i] != orderValue) {
                if (top >= 0 && tmpArr[top] == orderValue) {
                    top--;
                    i--;
                    orderValue++;
                } else {
                    tmpArr[++top] = stack[i];
                }
            } else {
                orderValue++;
            }
        }

        boolean result = true;

        while (top >= 0) {
            int tValue = tmpArr[top--];

            if (tValue == orderValue) {
                orderValue++;
            } else {
                result = false;
                break;
            }
        }

        return result ? "Nice" : "Sad";
    }
}
