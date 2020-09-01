import java.util.Scanner;

public class AlphabetSpam{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        sc.close();
        int white = 0;
        int lower = 0;
        int upper = 0;
        int symbols = 0;
        double sum = line.length();
        for(int i = 0 ; i < sum; i++){
            if(Character.isUpperCase(line.charAt(i))) upper++; 
            else if(Character.isLowerCase(line.charAt(i))) lower++;
            else if(line.charAt(i)=='_') white++;
            else symbols++;
        }

        System.out.println(white/sum);
        System.out.println(lower/sum);
        System.out.println(upper/sum);
        System.out.println(symbols/sum);
    }
}