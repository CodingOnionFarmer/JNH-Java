import java.util.Scanner;
import java.lang.StringBuilder;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder s = new StringBuilder("");
        for (int i=1;i<=n;i++){
            s.append("*");
            System.out.println(s);
        }
    }
}