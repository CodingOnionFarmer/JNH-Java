import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] alp = new int[26];
        for (int i=0; i<26; i++) {
        	alp[i]=-1;
        }
        for (int i=0; i<s.length(); i++) {
        	int n = s.charAt(i)-'a';
        	if (alp[n]<0) {
        		alp[n]=i;
        	}
        }
        for (int i=0; i<26; i++) {
        	System.out.printf("%d ", alp[i]);
        }
    }
}