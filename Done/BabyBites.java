package Difficulty1_5;

import java.util.Scanner;

public class BabyBites {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        boolean t = false;

        for(Integer i = 1 ; i <= n ; i++){
            String s = scan.next();
            String j = i.toString();
            if(s.equals(j) || s.equals("mumble")){

            } else{
                t = true;
            }
        }
        if(!t) System.out.println("makes sense");
        else System.out.println("something is fishy");
    }
}
