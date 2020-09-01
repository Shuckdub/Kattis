package Difficulty1_3;

import java.util.Scanner;

public class NastyHacks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int j = 0 ; j < n ; j++) {
            int r = scan.nextInt();
            int e = scan.nextInt();
            int c = scan.nextInt();
            int s = e-c;
            if(s<r){
                System.out.println("do not advertise");
            } else if(s==r){
                System.out.println("does not matter");
            } else{
                System.out.println("advertise");
            }
        }
    }
}
