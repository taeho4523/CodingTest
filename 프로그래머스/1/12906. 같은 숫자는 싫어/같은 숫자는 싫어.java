import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> number=new ArrayList<>();
        number.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[i]!= arr[i-1]){
                number.add(arr[i]);
            }
            
        }
        
        int[] answer=new int[number.size()];
        for(int i=0; i<number.size(); i++){
            answer[i]=number.get(i);
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}