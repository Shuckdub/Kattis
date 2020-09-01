import java.util.Scanner;

public class HeartRate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = 0 ;
        double p = 0.0;

        for(int i = 0 ; i < n ; i++){
            b = sc.nextInt();
            p = sc.nextDouble();

            double a = (b-1)*60/p;
            double c = (b)*60/p;
            double d = (b+1)*60/p;
            System.out.println(a + " " + c + " " + d);
            
        }
    }
}