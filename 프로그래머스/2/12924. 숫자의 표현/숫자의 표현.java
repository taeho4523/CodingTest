class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(isSum(n,i)){
                answer++;
            }
        }
        return answer;
    }
    
     private boolean isSum(int n, int i) {
        int sum = 0;
        for (int a = i; a <= n; a++) {
            sum += a;
            if (sum == n) return true; 
            if (sum > n) return false; 
        }
        return false;
    }

}