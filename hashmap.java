
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashmap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        HashMap<Integer,Integer> hash= new HashMap<>();
        for(int i=0;i<3;i++){
            hash.put(i,sc.nextInt());
        }
        for(Map.Entry entry:hash.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
}
}