import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String s = String.valueOf(m);
		for (int i=s.length()-1;i>=0;i--) {
			System.out.println((s.charAt(i)-'0')*n);
		}
		System.out.print(n*m);
	}
}
