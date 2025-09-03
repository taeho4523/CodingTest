
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int result=0;
		int n=Integer.parseInt(br.readLine());
		while(n>0) {
			if(n%5==0){
				result+=n/5;
				System.out.println(result);
				return;
			}
			n-=3;
			result++;
		}
		if(n==0){
			System.out.println(result);
		} else {
			System.out.println(-1);
		}
	}
}