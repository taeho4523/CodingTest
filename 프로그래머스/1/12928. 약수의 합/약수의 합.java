import java.util.ArrayList;
class Solution {
    public int solution(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<=n; i++){
            for(int j=n; j>=0; j--){
                if(i*j==n){
                    result.add(i);
                    result.add(j);
                }
            }
        }
        int answer=0;
        for(Integer i:result){
            answer+=i;
        }
        return answer/2;
    }
}