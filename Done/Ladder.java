package Difficulty1_3;

import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double h = scan.nextDouble();
        double v = scan.nextDouble();
        double sinV = Math.sin(Math.toRadians(v));
        double hypo = h/sinV;
        System.out.println((int)Math.ceil(hypo));
    }
}
