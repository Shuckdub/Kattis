import java.util.*;
public class Zamka {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int lo = sc.nextInt();
        int hi = sc.nextInt();
        int sum = sc.nextInt();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=lo;i<=hi;i++){
            int x = total((i+"").toCharArray(),sum);
            if(x>0){
                if(max<i)max=i;
                if(min>i)min=i;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
    static int total(char[] x,int y){
        int sum=0;
        for(int i=0;i<x.length;i++)sum+=Integer.parseInt(x[i]+"");
        return (sum==y)?sum:0;
    }
}