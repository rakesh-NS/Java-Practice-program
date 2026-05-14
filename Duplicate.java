import java.util.*;
public class Duplicate{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int[] arr= new int[a];
        for(int i=0;i<a;i++){
            arr[i]= sc.nextInt();
        }
        int c=0;
        int k=0;
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                if(arr[i]==arr[j]){
                    c++;
                    k=arr[i];
                }
            }
        }
        if(c!=0){
            System.err.println("yes for "+k);
        }
        else{
             System.err.println("no");
        }
    }
}