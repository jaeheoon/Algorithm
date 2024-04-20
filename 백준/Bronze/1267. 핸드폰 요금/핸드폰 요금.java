import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int YoungSik = 0;
        int MinSik = 0;
        int sec = 0;

        for (int i = 0; i < N; i++) {
            sec = stdIn.nextInt();
            YoungSik += ((sec / 30) + 1) * 10;
            MinSik += ((sec / 60) + 1) * 15;
        }

        if (MinSik == YoungSik) {
            System.out.println("Y M " + YoungSik);
        } else if (MinSik < YoungSik) {
            System.out.println("M " + MinSik);
        } else if (MinSik > YoungSik) {
            System.out.println("Y " + YoungSik);
        }

    }

 }