import java.util.Scanner;

public class SpeedLimit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int set = sc.nextInt();
            if(set == -1) {
                break;
            } else{
                int sum = 0;
                int a = 0;
                for(int i = 0 ; i < set ; i++){
                    int c = sc.nextInt();
                    int d = sc.nextInt();
                    sum += c * (d-a);
                    a = d;
                }
                System.out.println(sum + " miles");
            }
        }
    }
}