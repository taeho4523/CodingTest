import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		int n=Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++){
			int a= Integer.parseInt(br.readLine());
			if(a==0&&pq.isEmpty())
				System.out.println(0);
			else if(a==0){
				System.out.println(pq.poll());
			} else if (a>0){
				pq.add(a);
			}
		}

	}
}