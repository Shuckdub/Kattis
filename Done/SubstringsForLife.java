package Autori;

import java.util.Scanner;

public class SubstringsForLife {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        String in = name.substring(0,1);
        String b = "-";
        char c = b.charAt(0);
        for(int i = 1 ; i < name.length() ; i++) {

            if(name.charAt(i)==c){
                in = in + name.substring(i+1,i+2);
            }
        }
        System.out.println(in);
    }
}
