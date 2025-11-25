import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n=Integer.parseInt(br.readLine());
		int[] arr =new int[n];
		int[] fruits = new int[10];
		int max=Integer.MIN_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Deque<Integer> dq=new ArrayDeque<>();
		int startIndex=0;
		int endIndex=0;
		while(endIndex<n){
			dq.addLast(arr[endIndex]);
			fruits[arr[endIndex]]++;
			endIndex++;

			if(check2(fruits)>2){
				fruits[arr[startIndex]]--;
				startIndex++;
				dq.removeFirst();
			}
			max=Math.max(max,dq.size());
		}
		System.out.println(max);
	}
	static int check2(int[] fruits){
		int count=0;
		for(int fruit:fruits){
			if(fruit>0){
				count++;
			}
		}
		return count;
	}
}