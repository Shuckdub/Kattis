package Difficulty1_2;

import java.util.Scanner;

public class LastFactorialDigit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0 ; i<n ; i++){
                Integer sum = 1;
                int T = scan.nextInt();
                for(int j = 0 ; T > j ; T--){
                    sum *= T;
                }
                System.out.println(sum%10);
            }

    }
}
