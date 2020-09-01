import java.util.Scanner;

public class EasiestProblem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int ori = sc.nextInt();
            if(ori != 0){
                int tem = ori;
                int sumo = 0;
                int p = 11;
                while(ori > 0){
                    sumo += ori%10;
                    ori = ori/10;
                }
                while(true){
                    int temp = tem * p;
                    int sum = 0;
                    while(temp > 0){
                        sum += temp%10;
                        temp /= 10;
                    }
                    if(sum == sumo){
                        System.out.println(p);
                        break;
                    } else{
                        p++;
                    }
                }
            } else{
                break;
            }
        }
        
    }
}