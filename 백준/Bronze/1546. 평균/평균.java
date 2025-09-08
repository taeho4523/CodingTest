
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		int[] score=new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		int max=0;
		for(int i=0; i<n; i++){
			score[i]=Integer.parseInt(st.nextToken());
			if(max<score[i]) max=score[i];
		}
		double result=0;
		for(int i=0; i<n; i++){
			result += (score[i] / (double) max) * 100;
		}
		bw.write(String.valueOf(result/n));
		bw.flush();
		bw.close();
	}
}