import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static int N,M;
    static int[] arr;
    static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        visited=new boolean[N];
        arr=new int[M];
        dfs(0);

        System.out.println(sb);
    }
    public static void dfs(int depth){
        if(depth==M){
            for(int num:arr){
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=0; i<N; i++){
            if(!visited[i]){
                visited[i]=true;
                arr[depth]=i+1;
                dfs(depth+1);

                visited[i]=false;
            }
        }
    }
}
