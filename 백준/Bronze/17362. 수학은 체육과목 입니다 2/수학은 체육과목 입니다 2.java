import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n %= 8;
		if (n==0){
			n = 2;
		}
		else if (n>5){
			n -= (n-5)*2;
		}
		System.out.print(n);
	}
}
