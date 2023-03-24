import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int[] arr = new int[10];
        for (int i=0; i<10; i++) {
        	arr[i]=0;
        }
        String s = String.valueOf(a*b*c);
        for (int i=0;i<s.length(); i++) {
        	arr[s.charAt(i)-'0']++;
        }
        for (int i=0; i<10; i++) {
        	System.out.println(arr[i]);
        }
    }
}