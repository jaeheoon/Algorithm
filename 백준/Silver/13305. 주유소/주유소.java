import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BigInteger[] road = new BigInteger[n - 1];
        BigInteger[] oil = new BigInteger[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n - 1; i++) {
            road[i] = new BigInteger(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            oil[i] = new BigInteger(st.nextToken());
        }

        BigInteger result = oil[0].multiply(road[0]);
        BigInteger minPrize = oil[0];

        for (int i = 1; i < oil.length - 1; i++) {
            if (oil[i].compareTo(minPrize) < 0) {
                result = result.add(oil[i].multiply(road[i]));
                minPrize = oil[i];
            } else {
                result = result.add(minPrize.multiply(road[i]));
            }
        }
        System.out.println(result);
    }
}