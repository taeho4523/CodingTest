import java.util.*;
class Solution {
	static boolean[][] visited;
    static int[] dx={-1,1,0,0};
    static int[] dy={0,0,-1,1};
	public int solution(int[][] maps) {
		int answer = 0;
        int row=maps.length;
        int col=maps[0].length;
		visited=new boolean[row][col];
		answer= bfs(0,0,maps,col,row);
		return answer;
	}
	public int bfs(int startRow,int startCol,int[][] maps,int col,int row){
		int answer=0;
        Queue<int[]> q = new LinkedList<>();
		q.offer(new int[]{startRow,startCol,1});
		visited[startRow][startCol]=true;

        
	    while(!q.isEmpty()){
            int[] cur=q.poll();
            for(int i=0; i<4; i++){
                int tempx=cur[0];
                int tempy=cur[1];
                int dist=cur[2];
                if(tempx==row-1&&tempy==col-1) return dist;
                int nx=cur[0]+dx[i];
                int ny=cur[1]+dy[i];
                
                if(nx<0||ny<0||nx>=row||ny>=col) continue;
                if(!visited[nx][ny]&&maps[nx][ny]!=0){
                    visited[nx][ny]=true;
                    q.offer(new int[]{nx,ny,dist+1});
                    answer++;
                }
            }
            
        }
        return -1;
	}
}