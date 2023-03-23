import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n==100) {
			n--;
		}
		if (n<60) {
			n = 49;
		}
		int m = (100-n-1)/10;
		System.out.print((char)(65+m));

	}

}
