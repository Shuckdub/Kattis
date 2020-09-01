package Difficulty1_3;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FreeFood {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Set<Integer> daysOfEvents = new HashSet<>();

        for(int a = 0 ; a < n ; a++) {
            int s = scan.nextInt();
            int i = scan.nextInt();
            while(s<=i){
                daysOfEvents.add(s);
                s++;
            }
        }
        System.out.println(daysOfEvents.size());
    }
}
