
import java.io.*;
import java.util.*;


public class Main {
	static boolean[] visited;
	static int[][] map;
	static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		n =Integer.parseInt(br.readLine());
		map = new int[n+1][n+1];

		for(int i=1; i<=n; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1; j<=n; j++){
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for(int i=1; i<=n; i++){
			bfs(i);
			System.out.println();
		}






	}
	static void bfs(int node){
		visited=new boolean[n+1];
		Queue<Integer> q=new LinkedList<>();
		q.add(node);

		while(!q.isEmpty()){
			int cur=q.poll();
			for(int i=1; i<=n; i++){
				if(!visited[i]&&map[cur][i]==1){
					visited[i]=true;
					q.add(i);
				}
			}
		}
		for(int i=1; i<=n; i++){
			if(visited[i]){
				System.out.print(1+" ");
			} else
				System.out.print(0+" ");
		}


	}
}