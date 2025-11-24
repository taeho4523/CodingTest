import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long[] arr = new long[105];
		arr[1]=1;arr[2]=1;arr[3]=1;
		for(int i=4; i<=100; i++){
			arr[i]=arr[i-2]+arr[i-3];
		}
		int n=Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++){
			int a=Integer.parseInt(br.readLine());
			System.out.println(arr[a]);
		}
	}
}