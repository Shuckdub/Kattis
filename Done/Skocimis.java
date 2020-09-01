import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Skocimis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sumA = b-a;
        int sumB = c-b;
        int sum = 0;
        if(sumA > sumB){
            while(a < b && a < c){
                if(b < c){
                    c = b-1;
                } else {
                    b = c-1;
                }
                sum++;
            }
        } else {
            while(a < c && b < c){
                if(a < b){
                    a = b+1;
                } else {
                    b = a+1;
                }
                sum++;
            }
        }
        System.out.println(sum-1);
    
        sc.close();
    }
}