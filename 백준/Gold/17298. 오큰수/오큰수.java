
import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<Integer> stack=new Stack<>();
		int[] arr=new int[n];

		for(int i=0; i<n; i++){
			int num = Integer.parseInt(st.nextToken());
			arr[i]=num;
		}
		for(int i=0; i<n; i++){
			while(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
				arr[stack.pop()]=arr[i];
			}

			stack.push(i);

		}

		while(!stack.isEmpty()){
			arr[stack.pop()]=-1;
		}

		for(int i=0; i<n; i++){
			bw.write(String.valueOf(arr[i])+" ");

		}
		bw.flush();

	}
}