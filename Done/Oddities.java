package Difficulty1_3;

import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 0 ; i < n ; i++){
            int j = scan.nextInt();
            if(j%2==0){
                System.out.println(j+" is even");
            } else {
                System.out.println(j+" is odd");
            }
        }
    }
}
