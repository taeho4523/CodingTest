import java.util.*;
class Solution {
    public String solution(String s) {
        String[] arrs = s.split("");
        Arrays.sort(arrs,Collections.reverseOrder());
        String answer= String.join("",arrs);
        return answer;
    }
}