class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        if(n<m){
            int temp=m;
            m=n;
            n=temp;
        }
        answer[0]=gcd(n,m);
        answer[1]=(n*m)/answer[0];
        return answer;
    }
    
    private int gcd(int n, int m){
        while(m!=0){
            int temp=m;
            m=n%m;
            n=temp;
        }
        return n;
    }
}