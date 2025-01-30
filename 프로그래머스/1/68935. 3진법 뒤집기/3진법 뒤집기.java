import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        String result="";
        int mok=n;
        List<Integer> num = new ArrayList<>();
        while(mok!=0){
            num.add(mok%3);
            mok=mok/3;
        }
        int cnt=num.size()-1;
        int power=1;
        for(int i=cnt; i>=0; i--){
            answer+=num.get(i)*power;
            power*=3;
        }
        
        return answer;
    }
}