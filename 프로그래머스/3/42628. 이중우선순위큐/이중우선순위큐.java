import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());

        for(String op : operations) {
            String a=op.split(" ")[0];
            int b=Integer.parseInt(op.split(" ")[1]);
            if(a.equals("I")) {
                pq.add(b);
                pq2.add(b);
            } else if(a.equals("D")&&!pq.isEmpty()&&!pq2.isEmpty()) {
                if(b==-1){
                    int temp=pq.poll();
                    pq2.remove(temp);
                } else if(b==1){
                    int temp=pq2.poll();
                    pq.remove(temp);
                } else break;
            }
        }
        int max=0;
        int min=0;
        if(!pq.isEmpty()){
            min=pq.poll();
        }
        if(!pq2.isEmpty()){
            max=pq2.poll();
        }
        answer[0]=max;
        answer[1]=min;
       
        return answer;

    }
}