
import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		Deque<Integer> q = new ArrayDeque<>();
		for(int i=1; i<=n; i++){
			q.addLast(i);
		}


		sb.append("<");
		while(!q.isEmpty()){
			for(int i=0; i<k-1; i++){
				q.addLast(q.pollFirst());
			}
			sb.append(q.pollFirst());
			if(!q.isEmpty()) sb.append(", ");
		}
		sb.append(">");
		bw.write(sb.toString());
		bw.flush();
	}
}