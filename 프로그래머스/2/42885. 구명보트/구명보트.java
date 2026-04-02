import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int lastIndex=people.length-1;
        int firstIndex=0;
        while(true){
            if(people[firstIndex]+people[lastIndex]<=limit){
                answer++;
                firstIndex++;
                lastIndex--;
            }else {
                lastIndex--;
                answer++;
            }
            if(lastIndex<firstIndex) break;
            if(lastIndex==firstIndex){
                answer++;
                break;
            }
        }
        
        return answer;
    }
}