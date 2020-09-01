import java.util.Scanner;

public class SumKindOfProblem{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        for (int i = 0; i < p; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            int s1 = n * (n + 1) / 2;
            int s2 = n * n;
            int s3 = n * (n + 1);
            System.out.println(k + " " + s1 + " "+ s2 + " " + s3);
        }
    }
}