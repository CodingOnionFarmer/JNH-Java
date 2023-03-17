
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String ns = bf.readLine();
		String[] array_word;
		int n = 0;
		array_word = ns.split(""); //배열에 한글자씩 저장하기
		for(int i=0;i<array_word.length;i++) { //출력
		    int m = Integer.valueOf(array_word[i]);
		    n*=10;
		    n+=m;
		    n%=20000303;
		}
		System.out.println(n);

	}

}
