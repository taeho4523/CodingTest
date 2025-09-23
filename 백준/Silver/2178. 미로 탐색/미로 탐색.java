
import java.util.*;
import java.io.*;

class Main {
	static boolean[][] visited;
	static int[][] arr;
	static int N,M;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N][M];
		visited=new boolean[N][M];
		for(int i=0; i<N; i++){
			String line = br.readLine();
			for(int j=0; j<M; j++){
				int a = line.charAt(j) - '0';
				arr[i][j] = a;
			}
		}
		bfs(0,0);

		System.out.println(arr[N - 1][M - 1]);

	}

	public static void bfs(int x, int y){
		int[] move_x={0,0,-1,1};
		int[] move_y={-1,1,0,0};
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[]{x,y});

		visited[x][y] = true;

		while(!q.isEmpty()){
			int[] temp=q.poll();
			for(int i=0; i<4; i++){
				int nextX=temp[0]+move_x[i];
				int nextY=temp[1]+move_y[i];

				if (nextX < 0 || nextX >= N || nextY < 0 || nextY >= M)
					continue;
				if (arr[nextX][nextY] == 0)
					continue;
				if (visited[nextX][nextY])
					continue;

				q.offer(new int[]{nextX,nextY});
				visited[nextX][nextY] = true;

				arr[nextX][nextY] = arr[temp[0]][temp[1]]+1;
			}
		}
	}
}
