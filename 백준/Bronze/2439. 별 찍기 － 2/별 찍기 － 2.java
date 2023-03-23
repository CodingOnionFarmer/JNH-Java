import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		StringBuilder sb = new StringBuilder();
		for (int i=1; i<=n; i++) {
			sb.append(' ');
		}
		for (int i=n-1; i>=0; i--) {
			sb.setCharAt(i, '*');
			System.out.println(sb);
		}
	}
}