
import java.io.*;
import java.util.*;

public class Main {
	static int n;
	static int[] arr,dp;
	static int count;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		dp= new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.fill(dp, 1);
		for(int i=0; i<n; i++){
			for(int j=0; j<i; j++){
				if(arr[i]>arr[j]){
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
		}
		int answer=0;
		for(int val: dp){
			answer=Math.max(answer,val);
		}
		System.out.println(answer);

	}
}
