package FactorOfScience;

import java.util.Scanner;

public class BribeThemAll {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = scanner.nextInt();
        int sum = 0;
        if( 1 <= a && a <= 100 && 1<= i && i <= 100){
            int A = a;
            int I = i;
            sum = a * (i-1)+1;
            System.out.println(sum);
        }


    }
}
