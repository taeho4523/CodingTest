import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n=Integer.parseInt(st.nextToken()); //수의 개수 n
		int m=Integer.parseInt(st.nextToken()); //합을 구해야 하는 횟수 m

		int[] arr=new int[n+1];
		st=new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++){
			arr[0] = 0;
			arr[i]=arr[i-1]+Integer.parseInt(st.nextToken());
		}
		for(int i=0; i<m; i++){
			st=new StringTokenizer(br.readLine());
			int sum=0;
			int s=Integer.parseInt(st.nextToken());
			int e=Integer.parseInt(st.nextToken());
			bw.write(String.valueOf(arr[e]-arr[s-1])+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}