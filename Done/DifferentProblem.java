import java.util.Scanner;

public class DifferentProblem{
    public static void main(String[]args) throws Exception{
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            String[] num = sc.nextLine().split(" ");
            long fir = Long.parseLong(num[0]); 
            long sec = Long.parseLong(num[1]);
            if(fir < sec){
                System.out.println((sec-fir));
            } else{
                System.out.println(fir-sec);
            }
        }

        sc.close();
    }
}