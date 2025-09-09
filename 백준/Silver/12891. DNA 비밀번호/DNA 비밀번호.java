
import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s=Integer.parseInt(st.nextToken()); //문자열 길이
		int p=Integer.parseInt(st.nextToken()); //부분문자열 길이
		String str=br.readLine();
		char[] char_arr=new char[s];
		for(int i=0; i<s; i++){
			char_arr[i]=str.charAt(i);
		}
		st=new StringTokenizer(br.readLine()); //{A,C,G,T}
		int A=Integer.parseInt(st.nextToken());
		int C=Integer.parseInt(st.nextToken());
		int G=Integer.parseInt(st.nextToken());
		int T=Integer.parseInt(st.nextToken());
		int[] count=new int[4]; // 0, 1, 2, 3 -> A C G T
		int result=0;
		for(int i=0; i<p; i++){
			if(char_arr[i]=='A') {
				count[0]++;
			}else if(char_arr[i]=='C'){
				count[1]++;
			}else if(char_arr[i]=='G'){
				count[2]++;
			} else count[3]++;
		}
		if(count[0]>=A&&count[1]>=C&&count[2]>=G&&count[3]>=T){
			result++;
		}
		for(int i=p; i<s; i++){
			if(char_arr[i-p]=='A'){
				count[0]--;
			} else if(char_arr[i-p]=='C'){
				count[1]--;
			} else if(char_arr[i-p]=='G'){
				count[2]--;
			} else count[3]--;


			if(char_arr[i]=='A'){
				count[0]++;
			}else if(char_arr[i]=='C'){
				count[1]++;
			}else if(char_arr[i]=='G'){
				count[2]++;
			} else count[3]++;

			if(count[0]>=A&&count[1]>=C&&count[2]>=G&&count[3]>=T){
				result++;
			}
		}

		bw.write(String.valueOf(result));
		bw.flush();
		br.close();
		bw.close();

	}
}