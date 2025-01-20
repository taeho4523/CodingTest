class Solution {
    public int solution(int num) {
        long num2=num;
        int tmp=0;
        while(num2!=1){
            if(num2==1 && tmp<500){
                return 0;
            }
            else if(tmp>=500){
                return -1;
            }
            else if(num2%2==0 && tmp<500){
                num2=num2/2;
                tmp++;
            }
            else if(num2%2==1 && tmp<500){
                num2=num2*3+1;
                tmp++;
            }
        }
        return tmp;
    }
}