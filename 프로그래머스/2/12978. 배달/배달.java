import java.util.*;
class Solution {
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        //양방향 노드 추가
        List<List<int[]>> graph=new ArrayList<>();
        for(int i=0; i<=N; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] a : road){
            graph.get(a[0]).add(new int[]{a[1],a[2]});
            graph.get(a[1]).add(new int[]{a[0],a[2]});
        }
       
        //거리 배열 초기화
        int[] dist=new int[N+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[1]=0;
        
        //우선순위큐 설정
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{1,0});
        
        while(!pq.isEmpty()){
            int[] cur=pq.poll();
            int node=cur[0];
            int cost=cur[1];
            
            if(cost>dist[node]) continue;
            
            for(int[] next: graph.get(node)){
                int nextNode=next[0];
                int nextCost=next[1];
                if(dist[nextNode]>dist[node]+nextCost){
                    dist[nextNode]=dist[node]+nextCost;
                    pq.offer(new int[]{nextNode,dist[nextNode]});
                }
            }
        }
        for(int i=1; i<=N; i++){
            if(dist[i]<=K) answer++;
        }

        return answer;
    }
}