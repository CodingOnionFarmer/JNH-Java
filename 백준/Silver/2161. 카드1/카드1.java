import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		int n = new Scanner(System.in).nextInt();
		Queue<Integer> q = new LinkedList<>();
		for (int i=1;i<=n;i++) {
			q.add(i);
		}
		while (!q.isEmpty()) {
			System.out.print(q.poll());
			System.out.print(' ');
			if (!q.isEmpty()) {
				q.offer(q.poll());
			}
		}
		
	}
}
