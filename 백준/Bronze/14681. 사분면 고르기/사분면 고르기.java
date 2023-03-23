import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int key = 1;
		if (n>0) {
			if (m<0) {
				key+=3;
			}
		}
		else {
			key++;
			if (m<0) {
				key++;
			}
		}
		System.out.print(key);

	}

}
