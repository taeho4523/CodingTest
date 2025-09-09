
import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int start=1;
		int end=1;
		int sum=1;
		int count=1;
		while(end!=n){
			if(sum<n){
				end++;
				sum+=end;
			}else if(sum>n){
				sum-=start;
				start++;
			} else if(sum==n){
				count++;
				end++;
				sum+=end;
			}
		}
		bw.write(String.valueOf(count)+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}