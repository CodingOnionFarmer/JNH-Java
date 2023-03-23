import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int key = 0;
		if (n%4==0) {
			key++;
			if (n%100==0) {
				key--;
				if (n%400==0) {
					key++;
				}
			}
		}
		System.out.print(key);

	}

}
