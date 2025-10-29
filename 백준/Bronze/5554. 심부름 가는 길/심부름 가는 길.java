
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int c=Integer.parseInt(br.readLine());
		int d=Integer.parseInt(br.readLine());
		int sum = a+b+c+d;
		int minute=sum/60;
		int second=sum%60;
		System.out.println(minute);
		System.out.println(second);


	}
}