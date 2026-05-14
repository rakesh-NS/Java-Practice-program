import java.util.ArrayList;
import java.util.Scanner;
public class uArraylist{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr= new ArrayList<>();
for(int i=0;i<5;i++){
    arr.add(sc.nextInt());

}
for(int i=0;i<5;i++){
    System.err.println(arr.get(i));
}
    }
}