package Difficulty1_2;

import java.util.Scanner;

public class HissingMicrophone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        scan.close();
        boolean noHiss = true;
        for(int i = 1; i < line.length() ; i++){
                Character chat = line.charAt(i);
                Character chat1 = line.charAt(i-1);
                if(chat.equals(chat1)){
                    if(chat.equals('s')){
                        noHiss = false;
                        break;
                    }
                    }
            }
        if(noHiss){
            System.out.println("no hiss");
        } else{
            System.out.println("hiss");
        }
    }
}
