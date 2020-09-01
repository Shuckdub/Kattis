package Difficulty1_3;

import java.util.Scanner;

public class RoamingRomans {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double x = s.nextDouble();

        double w = 4854;
        double z = 5280;

        double sum = x * 1000 * z/w;

        int sums = (int)Math.round(sum);

        System.out.println(sums);
    }
}
