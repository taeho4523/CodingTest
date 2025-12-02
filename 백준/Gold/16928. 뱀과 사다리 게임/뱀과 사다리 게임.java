
import java.io.*;
import java.util.*;


public class Main {
	static int[] arr,move;
	static boolean visited[];
	static int[] dist;
	static int[] dice={1,2,3,4,5,6};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		move = new int[101];
		arr = new int[101];
		for(int i=1; i<100; i++){
			arr[i]=i;
		}
		for(int i=0; i<N; i++){

			st = new StringTokenizer(br.readLine());
			int start=Integer.parseInt(st.nextToken());
			int end=Integer.parseInt(st.nextToken());
			move[start]=end;
		}
		for(int i=1; i<=M; i++){
			st = new StringTokenizer(br.readLine());
			int start=Integer.parseInt(st.nextToken());
			int end=Integer.parseInt(st.nextToken());
			move[start]=end;
		}
		bfs(1);
		System.out.println(dist[100]);

	}
	static void bfs(int start){
		dist=new int[101];
		visited=new boolean[101];
		visited[start]=true;
		Queue<Integer> q=new LinkedList<>();
		q.add(arr[start]);

		while(!q.isEmpty()){
			int temp=q.poll();
			for(int i=0; i<6; i++){
				int dx=temp+dice[i];
				if(dx>100) continue;

				if(move[dx]!=0) dx=move[dx];
				if(!visited[dx]){
					visited[dx]=true;
					dist[dx]=dist[temp]+1;
					q.add(dx);
				}
			}
		}

	}
}