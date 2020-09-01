import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StarArrangements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            int i = 2;
            int j = 1;

            System.out.println(s + ":");
            while(true){
                int sum = 0;
                while(sum < s){
                    sum += i;
                    if(sum == s){
                        System.out.println(i + "," + j);
                    }
                    sum += j;
                    if(sum == s){
                        System.out.println(i + "," + j);
                    }
                }
                if(j!=i){
                    j++;
                } else {
                    i++;
                }
                if(i!=s){
                    continue;
                } else{
                    break;
                }
            }
        sc.close();
    }
}