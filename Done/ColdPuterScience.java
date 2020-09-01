package ColdPuterSciency;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColdPuterScience {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        List<Integer>temp = new ArrayList<>();
        int n = scanner.nextInt();

        for (int i = 0; i < n ; i++) {
            int t = scanner.nextInt();
            if (t < 0) {
                temp.add(t);
            }
        }
        System.out.println(temp.size());
    }
}
