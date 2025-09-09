
import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int[] arr=new int[n];
		int count=0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++){
			arr[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				if(arr[i]+arr[j]==m)count++;
			}
		}
		bw.write(String.valueOf(count));
		bw.flush();
		br.close();
		bw.close();
	}
}