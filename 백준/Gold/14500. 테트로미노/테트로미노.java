import java.io.*;
import java.util.*;


public class Main {
    static int n,m;
    static int[][] arr;
    static boolean [][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int max=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st  = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st  = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                visited[i][j] = true;
                dfs(i,j,1,arr[i][j]);
                visited[i][j] = false;
                checkShape(i,j);
            }
        }
        System.out.println(max);

    }
    public static void dfs(int x,int y, int depth, int sum) {
        if(depth==4){
            max = Math.max(max,sum);
            return;
        }

        for(int i=0; i<4; i++) {
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx<0||ny<0||nx>=n||ny>=m||visited[nx][ny]) continue;

            visited[nx][ny] = true;
            dfs(nx,ny,depth+1,sum+arr[nx][ny]);
            visited[nx][ny] = false;
        }

    }
    public static void checkShape(int x,int y) {// ㅗ ㅜ ㅓ ㅏ
        int middle=arr[x][y];

        for(int i=0; i<4; i++) {
            int sum=middle;
            boolean b=true;
            for(int j=0; j<4; j++) {
                if(i==j) continue;

                int nx=x+dx[j];
                int ny=y+dy[j];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m){
                    b=false;
                    break;
                }
                sum+=arr[nx][ny];

            }
            if(b) max=Math.max(max,sum);
        }
    }
}