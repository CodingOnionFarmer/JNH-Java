import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long t = sc.nextLong();
		long c = sc.nextLong();
		long p = sc.nextLong();
		System.out.print((n-1)/t*c*p);
	}
}
