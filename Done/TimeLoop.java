package StuckInATimeLoop;

import java.util.Scanner;

public class TimeLoop {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (1 <= n && n <= 100) {
            int N = n;
            for (int i = 1 ; i <= N ; i++) System.out.println(i + " Abracadabra");
        }
    }
}
