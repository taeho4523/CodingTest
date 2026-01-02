import java.util.*;
import java.io.*;


class Solution {
    public int solution(int[] nums) {
        int answer = 0;
    
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        int length=nums.length/2;
     
        if(map.size()>=length){
            answer=length;
        } else {
            answer=map.size();
        }
        return answer;
    }
}