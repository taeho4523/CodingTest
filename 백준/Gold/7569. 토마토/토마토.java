
import java.io.*;
import java.util.*;


public class Main {
	static int N,M,H;
	static int arr[][][];
	static Queue<int[]> q = new LinkedList<>();

	static int[] dx={1,-1,0,0,0,0};
	static int[] dy={0,0,1,-1,0,0};
	static int[] dz={0,0,0,0,1,-1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		M=Integer.parseInt(st.nextToken());
		N=Integer.parseInt(st.nextToken());
		H=Integer.parseInt(st.nextToken());
		arr =new int[H][N][M];
		for(int i=0;i<H;i++){
			for(int j=0;j<N;j++){
				st= new StringTokenizer(br.readLine());
				for(int k=0;k<M;k++){
					arr[i][j][k]=Integer.parseInt(st.nextToken());
					if(arr[i][j][k]==1){
						q.add(new int[]{i,j,k});
					}
				}
			}
		}
		bfs();

		int count =0;
		for(int i=0;i<H;i++){
			for(int j=0;j<N;j++){
				for(int k=0;k<M;k++){
					if(arr[i][j][k]==0){
						System.out.println(-1);
						return;
					}
					count=Math.max(count,arr[i][j][k]);
				}
			}
		}
		System.out.println(count-1);
	}
	static void bfs(){
		while(!q.isEmpty()){
			int[] temp=q.poll();
			int z=temp[0];
			int y=temp[1];
			int x=temp[2];
			for(int i=0; i<6; i++){
				int nz=temp[0]+dz[i];
				int ny=temp[1]+dy[i];
				int nx=temp[2]+dx[i];

				if(nz>=0&&ny>=0&&nx>=0&&nz<H&&ny<N&&nx<M&&arr[nz][ny][nx]==0){
					arr[nz][ny][nx]=arr[z][y][x]+1; //날짜체크위해
					q.add(new int[]{nz,ny,nx});
				}
			}
		}
	}
}