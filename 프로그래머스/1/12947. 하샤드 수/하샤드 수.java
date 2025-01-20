class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int number=0;
        int y = x;
        while(x!=0){
            number+=x%10;
            x/=10;
        }
        if(y%number==0){
            answer=true;
        }
        return answer;
    }
}