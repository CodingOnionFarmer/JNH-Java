import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int check = 0;
        for (int i=1;i<=5;i++){
            int m = sc.nextInt();
            check+=m*m;
        }
        System.out.print(check%10);
    }
}