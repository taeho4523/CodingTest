import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs,(o1, o2) -> o1[0]-o2[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1]-o2[1]);
        int index=0;
        int answer=0;
        int time=0;
        
        while(!pq.isEmpty()||index<jobs.length) {
            while(index<jobs.length&&jobs[index][0]<=time) {
                pq.add(jobs[index]);
                index++;
            }
            if(pq.isEmpty()){
                time=jobs[index][0];
            }else {
                int[] job = pq.poll();
                time+=job[1];
                answer+=time-job[0];
            }
        }
        return answer/jobs.length;
    }
}