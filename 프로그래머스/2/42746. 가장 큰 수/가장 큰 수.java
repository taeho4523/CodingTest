import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];
        int count=0;
        for(int i: numbers){
            str[count++]=String.valueOf(i);
        }

        Arrays.sort(str, (a,b)-> (b+a).compareTo(a+b));

        for( String i : str){
            answer+=i;
        }
        for(int i=0; i<answer.length(); i++){
            if(answer.charAt(i)!='0'||i==answer.length()-1){
                answer= answer.substring(i);
                break;
            }
        }
        return answer;
    }
}