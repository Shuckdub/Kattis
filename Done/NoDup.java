import java.util.ArrayList;
import java.util.Scanner;

public class NoDup{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String words = sc.nextLine();
        String[] word = words.split(" ");
        boolean answer = false;
        outer:for(int i = 0 ; i < word.length-1 ;i++ ){
                for(int j = i+1 ; j < word.length ; j++){
                    if(word[i].equals(word[j])){
                        System.out.print("no");
                        answer = true;
                        break outer;
                    }
                }
        }
        if(!answer){
            System.out.print("yes");
        }
    }
}