import java.io.*;
import java.util.*;
class Solution {

    public int[] solution(int[] progresses, int[] speeds) {

        List<Integer> answer = new ArrayList<>();

        for (int i = 0, day = 0; i < progresses.length; i++) {
            if (progresses[i] + speeds[i] * day < 100) {
                while (progresses[i] + speeds[i] * day < 100) day++;
                answer.add(1); 
            } else {
                int lastIndex = answer.size() - 1;
                answer.set(lastIndex, answer.get(lastIndex) + 1);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

}