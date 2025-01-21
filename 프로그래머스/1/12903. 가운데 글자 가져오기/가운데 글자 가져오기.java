class Solution {
    public String solution(String s) {
        int len = s.length()/2;
        String[] arr=s.split("");
        String answer="";
        if(s.length()%2==0){
            answer=arr[len-1]+arr[len];
        }
        if(s.length()%2==1){
            answer=arr[len];
        }
        return answer;
    }
}