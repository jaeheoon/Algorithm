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

        int[] arr = new int[6];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
        bw.write(solution(arr));
        bw.flush();
        bw.close();
    }

    static String solution(int[] stack) {
    	String result = "";
    	
    	int a = stack[0];
    	int b = stack[1];
    	int c = stack[2];
    	int d = stack[3];
    	int e = stack[4];
    	int f = stack[5];
    	
    	for (int i = -999; i <= 999; i++) {
			for (int j = -999; j <= 999; j++) {
				 if(a*i + b*j  == c){
                    if(d*i + e*j  == f) {
                        result = (i + " " + j + "\n");
                        break;
                    }
                }
			}
		}
    	
        return result;
    }
}