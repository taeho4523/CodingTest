import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			Stack<String> stack=new Stack<>();
			String a=br.readLine();
			boolean isVPN=true;
			for(int j=0; j<a.length(); j++){
				if(a.charAt(j)=='('){
					stack.push("(");
				} else if (a.charAt(j)==')'){
					if(stack.isEmpty()){
						isVPN=false;
						break;
					}
					stack.pop();
				}
			}
			if(!isVPN||!stack.isEmpty()) bw.write("NO\n");
			else bw.write("YES\n");
		}
		bw.flush();
	}
}