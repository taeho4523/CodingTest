
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int arr[][]= new int[n+1][n+1];
		for(int i=1; i<=n; i++){
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=n; j++) {
				arr[i][j] = arr[i][j-1]+Integer.parseInt(st.nextToken());
			}
		}

		for(int i=1; i<=m; i++){
			st = new StringTokenizer(br.readLine());
			int sum=0;
			int x1=Integer.parseInt(st.nextToken());
			int y1=Integer.parseInt(st.nextToken());
			int x2=Integer.parseInt(st.nextToken());
			int y2=Integer.parseInt(st.nextToken());
			for(int j=x1; j<=x2; j++){
				sum+=arr[j][y2]-arr[j][y1-1];
			}
			bw.write(String.valueOf(sum)+"\n");
		}
		bw.flush();
		bw.close();
	}
}