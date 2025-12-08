
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		String n=st.nextToken();
		String m=st.nextToken();
		int x=reverse(n);
		int y=reverse(m);
		int sum=x+y;

		System.out.println(reverse(String.valueOf(sum)));



	}
	static int reverse(String s){
		return Integer.parseInt(new StringBuilder(s).reverse().toString());
	}
}
