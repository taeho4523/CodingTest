
import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		Deque<Integer> dq=new ArrayDeque<>();
		for(int i=1; i<=n; i++){
			dq.add(i);
		}
		while(true)
		{
			if(dq.size()==1) {
				bw.write(dq.peekFirst()+"");
				break;
			}
			dq.removeFirst();
			int a=dq.peekFirst();
			dq.removeFirst();
			dq.addLast(a);
		}
		bw.flush();

	}
}