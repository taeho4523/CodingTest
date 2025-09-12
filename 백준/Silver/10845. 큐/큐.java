

import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		Deque<Integer> stack = new ArrayDeque<>();
		for(int i=0; i<n; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
				case "push":
					stack.addLast(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					if (stack.isEmpty()) {
						bw.write("-1\n");
					} else {
						bw.write(stack.pollFirst() + "\n");
					}
					break;
				case "size":
					bw.write(stack.size() + "\n");
					break;
				case "empty":
					bw.write(stack.isEmpty() ? "1\n" : "0\n");
					break;
				case "front":
					if (stack.isEmpty()){
						bw.write("-1\n");
					} else {
						bw.write(String.valueOf(stack.getFirst()+"\n"));
					}break;
				case "back":
					if(stack.isEmpty()){
						bw.write("-1\n");
					} else{
						bw.write(String.valueOf(stack.getLast()+"\n"));
					}break;
			}
		}
		bw.flush();
	}
}