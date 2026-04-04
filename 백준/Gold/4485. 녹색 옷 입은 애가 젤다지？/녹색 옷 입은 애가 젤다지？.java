
import java.io.*;
import java.util.*;

class Main {
    static int[] dx={-1,1,0,0};
    static int[] dy={0,0,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int temp=1;
        while(true){
            int N=Integer.parseInt(br.readLine());
            if (N==0) break;
            int[][] arr = new int[N][N];
            for(int i=0; i<N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j=0; j<N; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int[][] dist= new int[N][N];

            for(int[] row:dist){
                Arrays.fill(row,Integer.MAX_VALUE);
            }
            dist[0][0]=arr[0][0];

            PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[2]-b[2]);
            pq.offer(new int[]{0,0,dist[0][0]});

            while(!pq.isEmpty()){
                int[] cur = pq.poll();
                int x=cur[0],y=cur[1],cost=cur[2];

                if(cost>dist[x][y]){continue;}
                for(int i=0; i<4; i++){
                    int nx=x+dx[i],ny=y+dy[i];
                    if(nx<0||nx>=N||ny<0||ny>=N) continue;
                    if(dist[nx][ny]>dist[x][y]+arr[nx][ny]){
                        dist[nx][ny]=dist[x][y]+arr[nx][ny];
                        pq.offer(new int[]{nx,ny,dist[nx][ny]});
                    }
                }
            }

            System.out.println("Problem "+ temp++ + ": " + dist[N-1][N-1]);


        }

    }
}
