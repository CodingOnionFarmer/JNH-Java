import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int av = 0;
		for (int i=1;i<=5;i++) {
			av += (Math.max(sc.nextInt()/5, 8));
		}
		System.out.print(av);

	}

}
