class Solution {
    public long solution(int price, int money, int count) {
        long countprice=0;
        long answer = 0;
        for(int i=1; i<=count; i++){
            countprice+=price*i;
        }
        if(money>=countprice){
            answer=0;
        }
        if(money<countprice){
            answer=(long)countprice-(long)money;
        }
        return answer;
    }
}