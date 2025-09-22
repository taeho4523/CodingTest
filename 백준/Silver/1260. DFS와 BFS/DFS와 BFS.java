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
        int v= Integer.parseInt(st.nextToken());
        list=new ArrayList[n+1];
        visited=new boolean[n+1];
        for(int i=1;i<=n;i++){
            list[i]=new ArrayList<>();
        }
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        for (int i = 1; i <= n; i++) {
            Collections.sort(list[i]);
        }

        dfs(v);
        Arrays.fill(visited, false);
        System.out.println("");
        bfs(v);

    }
    static void dfs(int i){
        System.out.print(i+" ");
        visited[i]=true;
        for(int next:list[i]){
            if(!visited[next]){
                dfs(next);
            }
        }
    }
    static void bfs(int i){
        Queue<Integer> q=new LinkedList<>();
        q.offer(i);
        visited[i]=true;
        while(!q.isEmpty()){
            int next=q.poll();
            System.out.print(next+" ");
            for(int next2:list[next]){
                if(!visited[next2]){
                    q.offer(next2);
                    visited[next2]=true;
                }
            }
        }
    }
}
