import java.io.*;
import java.util.*;

public class Main {
	static int[][] tomato;
	static boolean[][] visited;
	static int row,col;
	static int[] dx={-1,1,0,0};
	static int[] dy={0,0,-1,1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		col=Integer.parseInt(st.nextToken());
		row=Integer.parseInt(st.nextToken());

		tomato = new int[row][col];

		Queue<int[]> q = new LinkedList<>();

		for(int i=0;i<row;i++){
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<col;j++){
				tomato[i][j]=Integer.parseInt(st.nextToken());
				if(tomato[i][j]==1){
					q.add(new int[]{i,j});
				}
			}
		}

		int day=bfs(q);

		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				if(tomato[i][j]==0){
					System.out.println(-1);
					return;
				}
			}
		}
		System.out.println(day);
	}

	public static int bfs(Queue<int[]> q){
		int day=0;

		while(!q.isEmpty()){
			int size=q.size();
			day++;

			for(int s=0; s<size; s++){
				int[] temp=q.poll();
				int x=temp[0],y=temp[1];
				for(int i=0;i<4;i++){
					int nx=x+dx[i],ny=y+dy[i];
					if(nx<0||ny<0||nx>=row||ny>=col){
						continue;
					}
					if(tomato[nx][ny]!=0){
						continue;
					}
					tomato[nx][ny]=1;
					q.add(new int[]{nx,ny});
				}
			}
		}
		return day-1;
	}
}