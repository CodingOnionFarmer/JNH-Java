import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		for (int i=1;i<=n;i++) {
			int a = sc.nextInt();
			if (a<x) {
				System.out.printf("%d ",a);
			}
		}
	}

}
