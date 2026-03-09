
import java.util.*;

class Solution {
	static boolean[] visited;
	static Set<Integer> set;

	public int solution(String numbers) {
		int answer = 0;
		visited=new boolean[numbers.length()];
		set=new HashSet<>();
		dfs("",numbers);
		for(int num : set){
			if(isPrime(num)){
				answer++;
			}
		}



		return answer;
	}
	public void dfs(String current, String numbers){
		if(!current.equals("")){
			set.add(Integer.parseInt(current));
		}
		for(int i=0; i<numbers.length(); i++){
			if(!visited[i]){
				visited[i]=true;
				dfs(current+numbers.charAt(i),numbers);
				visited[i]=false;
			}
		}
	}

	public boolean isPrime(int n){
		if(n<2){
			return false;
		}
		for(int i=2; i<=Math.sqrt(n); i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}