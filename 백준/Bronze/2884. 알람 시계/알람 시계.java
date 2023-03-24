import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if (m>44) {
        	m-=45;
        }
        else {
        	m+=15;
        	if (h>0) {
        		h-=1;
        	}
        	else {
        		h=23;
        	}
        }
        System.out.printf("%d %d",h,m);
    }
}