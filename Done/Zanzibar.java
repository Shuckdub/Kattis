import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Zanzibar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < T ; i++){
            list.clear();
            while(true){
                int temp = sc.nextInt();
                int imports = 0;
                if(temp == 0){
                    Iterator ite = list.iterator();
                    for(int j = 0 ; j < list.size()-1 ; j++){
                        if(ite.hasNext()){
                            if(list.get(j)*2 < list.get(j+1)){
                                imports += list.get(j+1)-list.get(j)*2;
                            }
                        }
                    }
                    System.out.println(imports);
                    break;
                } else{
                    list.add(temp);
                }
            }
        } 
    }
}