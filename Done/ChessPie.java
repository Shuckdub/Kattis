package ChessPieces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChessPie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer>max = new ArrayList<>();
        List<Integer>userInput = new ArrayList<>();
        max.add(1);
        max.add(1);
        max.add(2);
        max.add(2);
        max.add(2);
        max.add(8);
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            userInput.add(Integer.parseInt(scanner.next()));
        }
        for (int i = 0 ; i < 6 ; i++) {
            sum = max.get(i) - userInput.get(i);
            System.out.print(sum + " ");
        }
    }
}

