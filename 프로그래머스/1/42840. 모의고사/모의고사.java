import java.util.*;

class Solution {
    public int[] solution(int[] answers) {

        List<Integer> list = new ArrayList<>();
        int[] player1 = {1,2,3,4,5};
        int[] player2 = {2,1,2,3,2,4,2,5};
        int[] player3 = {3,3,1,1,2,2,4,4,5,5};

        int[] score = new int[3];

        for(int i=0; i<answers.length; i++){
            if(player1[i%5]==answers[i]) score[0]++;
            if(player2[i%8]==answers[i]) score[1]++;
            if(player3[i%10]==answers[i]) score[2]++;
        }

        int max = Math.max(score[0], Math.max(score[1], score[2]));
        for(int i=0; i<score.length; i++){
            if(score[i]==max) list.add(i+1);
        }
        int[] answer=new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
        }

        return answer;
    }
}
