import java.util.*;
import java.io.*;
class Solution {
	public String solution(String number, int k) {
		String answer = "";
		Stack<Integer> st = new Stack<>();
		int[] arr = new int[number.length()];
		int index=0;
		for(String a: number.split("")) {
			arr[index] = Integer.parseInt(a);
			index++;
		}
		for(int i=0; i<arr.length; i++) {

			while(k>0&&!st.isEmpty()&&st.peek()<arr[i]) {
				st.pop();
				k--;
			}
			st.push(arr[i]);

		}
        while(k!=0){
            st.pop();
            k--;
        }
		for(int a:st){
			answer+=String.valueOf(a);
		}

		return answer;
	}
}