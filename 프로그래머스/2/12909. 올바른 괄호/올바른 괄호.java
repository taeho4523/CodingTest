class Solution {
    boolean solution(String s) {
        boolean answer = false;
        String[] result=s.split("");
        int count=0;
        for(int i=0; i<result.length; i++){
            if(result[0].equals(")")){
                return false;
            }
            else if(result[i].equals("(")){
                count+=1;
            }
            else{
                count-=1;
                if(count<0){
                    return false;
                }
            }
        }
        if(count==0){
            return true;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(count);

        return answer;
    }
}