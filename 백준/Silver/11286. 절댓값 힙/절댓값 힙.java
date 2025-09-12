
import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> queue=new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(Math.abs(o1)==Math.abs(o2))
				return o1-o2; else return Math.abs(o1)-Math.abs(o2);
			}
		});
		for(int i=0; i<n; i++){
			int a=Integer.parseInt(br.readLine());
			if(a==0){
				if(queue.isEmpty()) bw.write("0\n");
				else bw.write(String.valueOf(queue.poll())+"\n");
			} else queue.offer(a);
		}
		bw.flush();
	}
}