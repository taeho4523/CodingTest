class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long large=Math.max(a,b);
        long small=Math.min(a,b);
        for(long i=small; i<=large; i++){
            answer+=i;
        }
        return answer;
    }
}