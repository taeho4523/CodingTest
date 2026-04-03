import java.util.*;
class Solution {
    static boolean visited[];
    static int answer=0;
    public int solution(int n, int[][] computers) {
        visited=new boolean[n];
        for(int i=0; i<n; i++){
            if(!visited[i]){
                bfs(i,computers,n);
                answer++;
            }
        }
        return answer;
    }
    public void bfs(int node, int[][] computers,int n){
        Queue<Integer> q= new LinkedList<>();
        visited[node]=true;
        q.offer(node);
        
        while(!q.isEmpty()){
            int cur=q.poll();
            for(int i=0; i<n; i++){
                if(computers[cur][i]==1&&!visited[i]){
                    q.offer(i);
                    visited[i]=true;
                }
            }
        }
    }
}