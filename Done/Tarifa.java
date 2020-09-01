package Difficulty1_3;

import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int n = s.nextInt();
        int sum = x*(n+1);
        for (int i = 0 ; i < n ; i ++){
            int monthlyUse = s.nextInt();
            sum -= monthlyUse;
        }
        System.out.println(sum);
    }
}
