import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {
		int n = new Scanner(System.in).nextInt();
		ArrayList lst = new ArrayList();
		for (int i=1;i<=n;i++) {
			lst.add(i);
		}
		long now = 0;
		for (long i=1;i<n;i++) {
			now += i*i*i - 1;
//			System.out.println(i*i*i - 1);
			now %= n-i+1;
//			System.out.println(now);
			lst.remove((int)now);
			
			now %= n-i;
//			System.out.print(now);
//			System.out.println(lst);
		}
		System.out.print(lst.get(0));
	}
}
