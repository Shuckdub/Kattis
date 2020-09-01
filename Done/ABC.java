import java.util.Scanner;

public class ABC{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        sc.nextLine();

        int min = Integer.min(Integer.min(f, s), Integer.min(s, t));
        int max = Integer.max(Integer.max(f, s),Integer.max(s, t));

        String ab = sc.nextLine();
    
        for(int i = 0 ; i < 3 ; i++){
            switch(ab.charAt(i)){
                case 'A':
                    System.out.print(min + " ");
                    break;
                case 'B':
                    if(f != max && f!= min) System.out.print(f + " ");
                    if(s != max && s!= min) System.out.print(s + " ");
                    if(t != max && t!= min) System.out.print(t + " ");
                    break; 
                case 'C':
                    System.out.print(max + " ");
                    break;
            }
        }
    }
}