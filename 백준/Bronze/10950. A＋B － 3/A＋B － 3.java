import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i=1; i<=t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			System.out.println(Integer.valueOf(st.nextToken())+Integer.valueOf(st.nextToken()));
		}
	}
}