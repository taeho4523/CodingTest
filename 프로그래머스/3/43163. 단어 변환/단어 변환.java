class Solution {
    static int answer=Integer.MAX_VALUE;
    static boolean[] visited;
    public int solution(String begin, String target, String[] words) {
       
        visited=new boolean[words.length];
        for (String w : words) {
        if (w.equals(target)) {
            dfs(begin, target, words, 0);
            return answer;
        }
    }
    return 0;
    }
    
    public void dfs(String current, String target, String[] words, int depth){
        if(current.equals(target)) {
            answer=Math.min(answer,depth);
            return;
        }
        for(int index=0; index<words.length; index++){
            if(!visited[index]&&canChange(current,words[index])){
                visited[index]=true;
                dfs(words[index],target,words,depth+1);
                visited[index]=false;
            }
        }
        return;
        
    }
public boolean canChange(String a, String b){
        int diff=0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)!=b.charAt(i)){
              diff++;  
            } 
        }
        if(diff==1) return true;
        return false;
}
}