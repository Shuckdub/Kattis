package Sibice;

import java.util.Scanner;

public class BoxSize
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();

        int area = h*h + w*w;
        for (int i = 0 ; i < n ; i++){
            int num = scan.nextInt();
            num = num*num;
            if(num <= area) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
