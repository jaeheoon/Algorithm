import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.parseInt(br.readLine());
    	System.out.println(sequence(N));
    }
    
    public static int sequence(int num){
    	int count = 0;	// 한수 카운팅
        
    	if(num < 100){
    		return num;
    	}
        
    	else {
    		count = 99; 
            
    		for(int i = 100; i <= num; i++){
    			int hun = i / 100;					// 백의 자릿수
    			int ten = (i / 10) % 10;			// 십의 자릿수
    			int one = i % 10;
                
    			if((hun - ten) == (ten - one)){		// 각 자릿수가 수열을 이루면
    				count++;
    			}
    		}
    	}
        
    	return count;
    }
}