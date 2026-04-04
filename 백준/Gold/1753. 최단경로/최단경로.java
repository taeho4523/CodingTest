
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int Node=Integer.parseInt(st.nextToken());
        int Line=Integer.parseInt(st.nextToken());

        //양방향 그래프 설정
        List<List<int[]>> graph = new ArrayList<>();
        for(int i=0; i<Node+1; i++){
            graph.add(new ArrayList<>());
        }

        int startNode=Integer.parseInt(br.readLine());
        //거리 배열 설정
        int[] dist=new int[Node+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[startNode]=0;


        for(int i=0; i<Line; i++){
            st=new StringTokenizer(br.readLine());
            int start=Integer.parseInt(st.nextToken());
            int end=Integer.parseInt(st.nextToken());
            int weight=Integer.parseInt(st.nextToken());
            graph.get(start).add(new int[]{end,weight});
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{startNode,0});

        while(!pq.isEmpty()){

            int[] cur=pq.poll();
            int node=cur[0],weight=cur[1];

            if(weight>dist[node]) continue;

            for(int[] next:graph.get(node)){
                int nextNode=next[0],nextWeight=next[1];
                if(dist[nextNode]>dist[node]+nextWeight){
                    dist[nextNode]=dist[node]+nextWeight;
                    pq.offer(new int[]{nextNode,dist[nextNode]});
                }
            }
        }

        for (int i = 1; i <= Node; i++) {
            if (dist[i] == Integer.MAX_VALUE) System.out.println("INF");
            else System.out.println(dist[i]);
        }

    }
}
