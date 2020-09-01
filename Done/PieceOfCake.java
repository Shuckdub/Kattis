import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PieceOfCake{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int h = sc.nextInt();
            int v = sc.nextInt();
            int temp = n;

            if(n%2==1){
                temp++;
            }

            if(temp/2 <= h && temp/2 <= v){
                System.out.println(h*v*4);
            } else if (temp/2 <= h){
                System.out.println(h*(n-v)*4);
            } else if(temp/2 <= v){
                System.out.println(v*(n-h)*4);
            } else {
                System.out.println((n-v)*(n-h)*4);
            }
    }
}