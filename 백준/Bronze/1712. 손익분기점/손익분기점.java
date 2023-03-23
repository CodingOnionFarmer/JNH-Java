import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt() - b;
		if (c>0) {
			System.out.print(a/c+1);
		}
		else {
			System.out.print(-1);
		}

	}

}
