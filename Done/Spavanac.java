package Difficulty1_3;

import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int m = s.nextInt();
        if(m < 45) {
            if(h == 0)
                h = 23;
            else
                h--;
            m = 60 - (45 - m);
        }
        else {
            m -= 45;
        }

        System.out.printf("%d %d\n", h, m);
    }
}