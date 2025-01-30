import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int result = 0;
        Arrays.sort(d);
        for(int i=0; i<d.length; i++){
            answer+=d[i];
             System.out.println(answer+"answer");
            if(answer<=budget){
                result++;
                System.out.println(result+"result");
            }
        }
        return result;
    }
}