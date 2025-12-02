
import java.io.*;
import java.util.*;


public class Main {
	static char[][] arr;
	static int N;
	static boolean[][] visited;
	static int[] dx={-1,1,0,0};
	static int[] dy={0,0,-1,1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N=Integer.parseInt(br.readLine());
		arr=new char[N][N];
		for(int i=0;i<N;i++){
			String s=br.readLine();
			for(int j=0;j<N;j++){
				arr[i][j]=s.charAt(j);
			}
		}
		//blind
		visited=new boolean[N][N];
		int result=0;
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(!visited[i][j]){
					bfs1(i,j,true);
					result++;
				}
			}
		}

		visited=new boolean[N][N];
		int count=0;
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(!visited[i][j]){
					bfs1(i,j,false);
					count++;
				}
			}
		}
		System.out.print(count+" "+result);
	}
	static void bfs1(int x, int y, boolean mode){
		Queue<int[]> q=new LinkedList<>();
		visited[x][y]=true;
		q.offer(new int[]{x,y});
		char rgb=arr[x][y];
		while(!q.isEmpty()){
			int temp[]=q.poll();
			for(int k=0;k<4;k++){
				int nx=temp[0]+dx[k],ny=temp[1]+dy[k];
				if(nx<N&&ny<N&&nx>=0&&ny>=0&&!visited[nx][ny]&&mode){
					if((rgb=='R'||rgb=='G')&&(arr[nx][ny]=='R'||arr[nx][ny]=='G')){
						visited[nx][ny]=true;
						q.offer(new int[]{nx,ny});
					} else if(rgb=='B'&&arr[nx][ny]=='B'){
						visited[nx][ny]=true;
						q.offer(new int[]{nx,ny});
					}
				} else if(nx<N&&ny<N&&nx>=0&&ny>=0&&!visited[nx][ny]&&!mode){
					if(arr[nx][ny]==rgb){
						visited[nx][ny]=true;
						q.offer(new int[]{nx,ny});
					}
				}
			}
		}
	}
}