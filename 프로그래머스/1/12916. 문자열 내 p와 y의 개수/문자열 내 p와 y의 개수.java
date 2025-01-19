class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p=0;
        int y=0;
        String a= s.toLowerCase();
        for(char i:a.toCharArray()){
            if(i=='p'){
                p+=1;
            }
            else if(i=='y'){
                y+=1;
            }
        }
        if(p!=y){
            answer=false;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(a);
        
        return answer;
    }
}