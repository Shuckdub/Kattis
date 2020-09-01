package Difficulty1_3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Everywhere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int travels = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < travels ; i++){
            Set<String> places = new HashSet<>();
            int amount = sc.nextInt();
            for(int j = 0 ; j < amount ; j++){
                places.add(sc.next());
            }
            System.out.println(places.size());
            places.clear();
        }
    }
}
