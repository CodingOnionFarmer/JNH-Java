import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n/100*78);
        System.out.print(' ');
        System.out.print(n/1000*956);
    }
}