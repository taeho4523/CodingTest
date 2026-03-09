import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int length=brown+yellow;
        for(int h=3; h<=length; h++){
            if(length%h!=0) continue;
            int w=length/h;
            if(2*(w+h)-4==brown){
                answer[0]=h;
                answer[1]=w;
            }
        }
        
        return answer;
    }
}

