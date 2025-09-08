
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		String number=br.readLine();

		br.close();
		int result=0;
		for(int i=0; i<n; i++){
			result+=number.charAt(i)-'0';
		}
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}
}