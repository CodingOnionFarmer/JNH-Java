import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int mi = 1000000;
        int ma = -1000000;
        for (int i=1; i<=n; i++) {
        	int m = Integer.parseInt(st.nextToken());
        	if (m<mi) {
        		mi=m;
        	}
        	if (m>ma) {
        		ma=m;
        	}
        }
        System.out.printf("%d %d",mi,ma);
    }
}