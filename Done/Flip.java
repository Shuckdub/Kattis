package Difficulty1_2;

import java.util.Scanner;

public class Flip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer first = sc.nextInt();
        Integer second = sc.nextInt();
        StringBuffer reversedFirst = new StringBuffer(first.toString());
        reversedFirst.reverse();
        StringBuffer reversedSecond = new StringBuffer(second.toString());
        reversedSecond.reverse();
        first = Integer.parseInt(reversedFirst.toString());
        second = Integer.parseInt(reversedSecond.toString());
        if(first < second){
            System.out.println(reversedSecond);
        } else{
            System.out.println(reversedFirst);
        }


    }
}
