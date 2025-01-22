class Solution {
    public boolean solution(String s) {
        int len = s.length();
        if(len==4 || len==6){
            try{
                int parint=Integer.parseInt(s);
                return true;
            } catch(Exception e){
                return false;
            }
        }
        
        
        return false;
    }
}