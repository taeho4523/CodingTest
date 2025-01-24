class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(s.length()>1){
            int count=0;
            String[] array=s.split("");
            for(int i=0; i<array.length; i++){
                if(array[i].equals("0")){
                    answer[1]++;
                }
                else count++;
            }
            s=Integer.toBinaryString(count);
            answer[0]++;
        }
        return answer;
    }
    
}