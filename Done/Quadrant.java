package QuadrantSelection;

import java.util.Scanner;

public class Quadrant {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        if(-1000 <= X  && X <= 1000 && X != 0){
            int x = X;
            if(-1000 <= Y  && Y <= 1000 && Y != 0){
                int y = Y;
                if(x < 0 && y < 0){
                    System.out.println(3);
                } else if (0 < x && 0 < y) {
                    System.out.println(1);
                } else if (0 < x && y < 0) {
                    System.out.println(4);
                } else {
                    System.out.println(2);
                }
            }
        }


    }
}
