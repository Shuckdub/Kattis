import java.util.Scanner;

public class ARealChallenge{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();

        p = Math.sqrt(p);
        p *= 4;
        
        System.out.println(p);
    }
}