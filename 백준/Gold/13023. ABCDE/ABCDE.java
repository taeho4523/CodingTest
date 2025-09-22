import java.io.*;
import java.util.*;

public class Main {
    public static ArrayList<Integer>[] list;
    public static boolean[] visited;
    public static int result=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        visited= new boolean[n];
        list= new ArrayList[n];
        for(int i=0; i<n; i++){
            list[i]=new ArrayList<>();
        }
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }

        for(int i=0; i<n; i++){
            if(result!=1){
                dfs(i,1);
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();

    }
    static void dfs(int start, int depth){
        if(depth==5){
            result=1;
            return;
        }
        visited[start]=true;
        for(int next : list[start]){
            if(!visited[next]){
                dfs(next,depth+1);
            }
        }
        visited[start]=false;
    }
}
