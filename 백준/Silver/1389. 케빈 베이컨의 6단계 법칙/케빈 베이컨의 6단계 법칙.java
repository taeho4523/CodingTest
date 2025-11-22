import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static ArrayList<Integer>[] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        graph = new ArrayList[n+1];
        for(int i=1; i<=n; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int i=1; i<=m; i++) {
            st= new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }
        int max=Integer.MAX_VALUE;
        int person =0;
        for(int i=1; i<=n; i++) {

            int sum=bfs(i);
            if(sum<max){
                max=sum;
                person=i;
            }
        }
        System.out.println(person);


    }
    static int bfs(int start){
        int[] dist=new int[n+1];
        Arrays.fill(dist,-1);
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        dist[start]=0;

        while(!q.isEmpty()){
            int temp=q.poll();
            for(int v: graph[temp]){
                if(dist[v]==-1){
                    dist[v]=dist[temp]+1;
                    q.add(v);
                }
            }
        }
        int sum=0;
        for(int i=1; i<=n; i++) {sum+=dist[i];}
        return sum;
    }
}
