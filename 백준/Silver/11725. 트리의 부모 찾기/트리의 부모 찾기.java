import java.io.*;
import java.util.*;


public class Main {
    static ArrayList<Integer>[] graph;
    static int[] parent;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine());
        graph=new ArrayList[n+1];
        parent = new int[n+1];
        visited=new boolean[n+1];

        for(int i=1;i<=n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0; i<n-1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        bfs(1);

        for(int i=2; i<=n; i++){
            System.out.println(parent[i]);
        }
    }
    static void bfs(int start){
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int temp=q.poll();
            visited[temp]=true;
            for(int v:graph[temp]){
                if(!visited[v]){
                    visited[v]=true;
                    parent[v]=temp;
                    q.add(v);
                }
            }
        }
    }
}