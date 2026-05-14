import java.util.Scanner;
public class strbuffer {
    public static void main(String[] args) {   
    Scanner sc= new Scanner(System.in);
    StringBuilder str= new StringBuilder();
    for(int i=0;i<5;i++){
        str.append(sc.nextLine());
    }
    String st=str.substring(0, 3);
    System.err.println(""+st);
}
}