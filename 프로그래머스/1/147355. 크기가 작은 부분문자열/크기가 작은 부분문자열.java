class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i=0; i<t.length()-p.length()+1; i++){
            String result=t.substring(i,i+p.length());
            if(Long.parseLong(result)<=Long.parseLong(p)){
                answer+=1;
            }
        }
        return answer;
    }
}