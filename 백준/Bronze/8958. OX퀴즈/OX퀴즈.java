import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i=0; i<t; i++) {
        	int sum = 0;
            int score = 0;
        	String ox = br.readLine();
        	for (int j=0; j<ox.length(); j++) {
        		if (ox.charAt(j)=='O') {
        			score+=1;
        		}
        		else {
        			score=0;
        		}
        		sum+=score;
        	}
            System.out.println(sum);
        }
    }
}