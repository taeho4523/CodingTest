import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		int [] arr= new int[N*M];
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				arr[i*M+j]=Integer.parseInt(st.nextToken());
				if(arr[i*M+j]>max) max=arr[i*M+j];
				if(arr[i*M+j]<min) min=arr[i*M+j];
			}
		}
		int answerTime = Integer.MAX_VALUE;
		int answerHeight = 0;

		for(int i=min; i<=max; i++) {
			int remove=0;
			int build=0;
			for(int j=0; j<N*M; j++){
				if(arr[j]>i){
					remove+=arr[j]-i;
				} else {
					build+=i-arr[j];
				}
			}

			if (remove + B >= build) {
				int t = remove * 2 + build;
				if (t < answerTime || (t == answerTime && i > answerHeight)) {
					answerTime = t;
					answerHeight = i;
				}
			}
		}
		System.out.println(answerTime+" "+answerHeight);


	}
}