
import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr =new int[n];
		int good =0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++){
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		for(int i=0; i<n; i++){
			long target=arr[i];
			int left=0;
			int right=n-1;

			while(left<right){
				if(left==i){
					left++;
					continue;
				}
				if(right==i){
					right--;
					continue;
				}

				int sum=arr[left]+arr[right];
				if(sum==target){
					good++;
					break;
				} else if(sum<target){
					left++;
				} else {
					right--;
				}
			}

		}
		bw.write(String.valueOf(good));
		bw.flush();
		bw.close();
		br.close();
	}
}