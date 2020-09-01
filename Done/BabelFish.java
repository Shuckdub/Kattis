import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BabelFish{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        Map<String, String> book = new HashMap<>();
        while(true){
            String line = sc.nextLine();
            if(line.isEmpty()){
                break;
            }
            String[] lines = line.split(" ");
            book.put(lines[1], lines[0]);
        }
        while(sc.hasNext()){
            String line = sc.nextLine();
            
            if(line.isEmpty()){
                break;
            }
            if(book.containsKey(line)){
                System.out.println(book.get(line));
            } else{
                System.out.println("eh");
            }
        }
        sc.close();
    }
}