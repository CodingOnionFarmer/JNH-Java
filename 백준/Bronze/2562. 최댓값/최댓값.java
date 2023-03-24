import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = 0;
        int n = 0;
        int ind = 0;
        for (int i=1; i<10; i++) {
        	n = Integer.parseInt(br.readLine());
        	if (n>m) {
        		m=n;
        		ind=i;
        	}
        }
        System.out.println(m);
        System.out.println(ind);
    }
}