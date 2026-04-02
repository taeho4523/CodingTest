import java.io.*;
import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet=new HashSet<>();
        
        for(int a : lost) lostSet.add(a);
        for(int b: reserve) reserveSet.add(b);
        
        for(int r: reserve){
            if(lostSet.contains(r)){
                reserveSet.remove(r);
                lostSet.remove(r);
            }
        }
        for(int a:new ArrayList<>(lostSet)){
            if(reserveSet.contains(a-1)){
                reserveSet.remove(a-1);
                lostSet.remove(a);
            } else if(reserveSet.contains(a+1)){
                reserveSet.remove(a+1);
                lostSet.remove(a);
            }
        }
        
        return n-lostSet.size();
    }
}