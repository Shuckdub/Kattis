import java.util.*;
public class SymmetricOrder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int n = 1;
        ArrayList<String> a = new ArrayList<String>();
        while(true){
            if(sc.hasNextInt()){
                i = sc.nextInt();
                if(i==0){
                    break;
                } else {
                    System.out.println("SET " + n);
                    n++;
                    a.clear();
                }
            } else{
                while(true){
                    if(sc.hasNextInt()){
                        ArrayList<String> temp = new ArrayList<String>();
                        ArrayList<String> tempb = new ArrayList<String>();
                        Collections.sort(a,Comparator.comparing(String::length));
                        for(int s = 0 ; s < a.size() ; s++){
                            if(s%2== 0){
                                temp.add(a.get(s));
                            } else{
                                tempb.add(a.get(s));
                            }
                        }
                        Collections.reverse(tempb);
                        temp.forEach(System.out::println);
                        tempb.forEach(System.out::println);
                        temp.clear();
                        tempb.clear();
                        break;
                    } else {
                        a.add(sc.next());
                    }
                }
            }
        }
    }
}