import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for(int a : scoville){
            pq.add(a);
        }
        while(pq.peek()<K){
            if(pq.size()<2){
                return -1;
            }
            int a=pq.poll();
            int b=pq.poll();
            int newOne=2*b+a;
            pq.add(newOne);
            answer++;
        }
        return answer;
    }
}