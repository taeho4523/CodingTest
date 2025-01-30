class Solution {
    public String solution(String s) {
        String answer = "";
        s=s.toLowerCase();
        String[] split=s.split("");
        int idx=0;
        for(int i=0; i<split.length; i++){
            if(split[i].equals(" ")){
                idx=0;
            }
            else if(idx%2==0){
                split[i]=split[i].toUpperCase();
                idx++;
            }
            else if(idx%2==1){
                split[i]=split[i].toLowerCase();
                idx++;
            }
            answer+=split[i];
            
        }
        return answer;
    }
}