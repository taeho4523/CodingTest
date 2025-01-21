import java.util.ArrayList;
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        ArrayList<Integer> number=new ArrayList<>();
        for(int i=left; i<=right; i++){
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    number.add(j);
                }
            }
            if(number.size()%2==0){
                    answer+=i;
                    number.clear();
                }
            if(number.size()%2==1){
                answer-=i;
                number.clear();
            }
        }
        
        return answer;
    }
}