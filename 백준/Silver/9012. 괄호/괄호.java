import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
 
public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            Stack<Character> ck = new Stack<>();
            String str = br.readLine();
            boolean check = true;

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (ch == '(') {
                    ck.push(ch);
                } else if (ch == ')') {
                    if (!ck.isEmpty()) {
                        ck.pop();
                    } else {
                    	check = false;
                        break;
                    }
                }
            }

            if (check && ck.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
	}
	
}