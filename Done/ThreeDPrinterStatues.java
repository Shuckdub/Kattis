import java.util.Scanner;

public class ThreeDPrinterStatues{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int n = 1;
        int sum = 0;
        int d = 0;
        while(n < p){
            n += n;
            d++;
        }
        while(sum < p){
            sum += n;
            d++;
        }
        System.out.println(d);
    }
}