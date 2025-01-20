import java.util.ArrayList;
import java.util.*;
class Solution {
    public long solution(long n) {
        String number = String.valueOf(n);
        String[] a = number.split("");
        Arrays.sort(a,Collections.reverseOrder());
        String numberjoin=String.join("",a);
        long answer = Long.parseLong(numberjoin);
        return answer;
    }
}