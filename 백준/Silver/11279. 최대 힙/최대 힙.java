import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n =Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0; i<n; i++){
			int a=Integer.parseInt(br.readLine());
			if(pq.isEmpty()&&a==0){
				System.out.println(0);
			} else if(!pq.isEmpty()&&a==0){
				System.out.println(pq.poll());
			}
			else pq.offer(a);
		}
	}
}