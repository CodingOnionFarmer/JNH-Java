import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int burger = 2000;
		int soda = 2000;
		for (int i=1;i<=3;i++) {
			burger = Math.min(burger, sc.nextInt());
		}
		for (int i=1;i<=2;i++) {
			soda = Math.min(soda, sc.nextInt());
		}
		System.out.print(burger+soda-50);

	}

}
