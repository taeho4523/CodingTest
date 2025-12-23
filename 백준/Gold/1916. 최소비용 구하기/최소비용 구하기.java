import java.io.*;
import java.util.*;


public class Main {
    static class Node implements Comparable<Node>{
        int arrive;
        int cost;

        Node(int arrive, int cost){
            this.arrive = arrive;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost-o.cost;
        }
    }
    static int city,bus;
    static ArrayList<Node>[] graph;
    static int[] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        city = Integer.parseInt(br.readLine());
        bus = Integer.parseInt(br.readLine());
        graph = new ArrayList[city+1];
        distance = new int[city+1];

        for(int i=1; i<=city; i++){
            graph[i] = new ArrayList<>();
            distance[i] = Integer.MAX_VALUE;
        }

        for(int i=0; i<bus; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start=Integer.parseInt(st.nextToken());
            int end=Integer.parseInt(st.nextToken());
            int cost=Integer.parseInt(st.nextToken());

            graph[start].add(new Node(end, cost));
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int startStation = Integer.parseInt(st.nextToken());
        int endStation = Integer.parseInt(st.nextToken());

        dijkstra(startStation);

        System.out.println(distance[endStation]);
    }

    static void dijkstra(int startStation){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        distance[startStation]=0;
        pq.offer(new Node(startStation, 0));

        while(!pq.isEmpty()){
            Node temp=pq.poll();
            int cur = temp.arrive;
            int cost=temp.cost;

            if(cost>distance[cur]) continue;

            for(Node next:graph[cur]){
                int nextCost=distance[cur]+next.cost;

                if(nextCost<distance[next.arrive]){
                    distance[next.arrive]=nextCost;
                    pq.offer(new Node(next.arrive, nextCost));
                }
            }
        }
    }

}