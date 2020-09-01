package Difficulty1_2;

import java.util.Scanner;

public class GrassSeedInc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double c = scan.nextDouble();
        int l = scan.nextInt();
        double sum = 0;
        for(int i = 0 ; i < l ; i++){
            double w = scan.nextDouble();
            double j = scan.nextDouble();
            sum += w*j;
        }
        sum *= c;
        System.out.println(sum);
    }
}
