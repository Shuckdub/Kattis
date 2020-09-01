package Difficulty1_3;

import java.util.Scanner;

public class RSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int s = sc.nextInt();

        int average = r - s;

        r = s - average;

        System.out.println(r);
    }
}
