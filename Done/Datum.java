import java.util.Scanner;

public class Datum{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int[] month = {0,31,59,90,120,151,181,212,243,273,304,334};

        int d = scan.nextInt();
        int m = scan.nextInt();

        int day = (month[m-1] + d)%7 ;
        switch (day) {
        case 1:
            System.out.println("Thursday");
            break;
        case 2:
            System.out.println("Friday");
            break;
        case 3:
            System.out.println("Saturday");
            break;
        case 4:
            System.out.println("Sunday");
            break;
        case 5:
            System.out.println("Monday");
            break;
        case 6:
            System.out.println("Tuesday");
            break;
        case 0:
            System.out.println("Wednesday");
            break;
        }

    }    
}