package Difficulty1_2;

import java.util.Scanner;

public class QualityAdjustedLifeYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        double sum = 0;
        for (int i = 0; i <n ; i++){
            double q = s.nextDouble();
            double y = s.nextDouble();
            sum = sum + (q*y);
        }
        System.out.println(sum);
    }
}
