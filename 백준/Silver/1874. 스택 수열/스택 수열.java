
import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb= new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		Stack<Integer> st=new Stack<>();
		for(int i=1; i<=n; i++){ //1번 인덱스부터 1
			arr[i]=i;
		}
		int temp=1;
		for(int i=0; i<n; i++){
			int num=Integer.parseInt(br.readLine());
			while(true){
				if(st.isEmpty()){
					st.push(arr[temp]);
					temp++;
					sb.append("+\n");
				} else if(st.peek()<num){
					st.push(arr[temp]);
					temp++;
					sb.append("+\n");
				} else if(st.peek()==num){
					st.pop();
					sb.append("-\n");
					break;
				} else{
					sb=new StringBuilder();
					sb.append("NO");
					System.out.println(sb);
					return;}
			}
		}
		System.out.println(sb);

	}
}