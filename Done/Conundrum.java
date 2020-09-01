import java.util.Scanner;

public class Conundrum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int amount = 0;
        for(int i = 0 ; i < line.length() ; i++){
            switch(i % 3){
                case 0:
                if(line.charAt(i) != 'P') amount++;
                break;
                case 1:
                if(line.charAt(i) != 'E') amount++;
                break;
                case 2:
                if(line.charAt(i) != 'R') amount++;
                break;
            }
        }
        System.out.print(amount);
    }
}