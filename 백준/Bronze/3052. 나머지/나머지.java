import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] rem = new int[42];
        for (int i=0; i<42; i++) {
        	rem[i]=0;
        }
        for (int i=0; i<10; i++) {
        	rem[(Integer.parseInt(br.readLine()))%42]=1;
        }
        int sum=0;
        for (int i=0; i<42; i++) {
        	sum+=rem[i];
        }
        System.out.print(sum);
    }
}