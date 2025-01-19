import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer=0;
        String strn=Integer.toString(n);
        String[] strnn=strn.split("");
        for(String i:strnn){
            int k=Integer.parseInt(i);
            answer+=k;
        }

        return answer;
    }
}