
import java.util.*;
import java.io.*;

public class Main {
	static int arr[][];
	static int count=0;
	static boolean visited[];
	static int computer,network;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		computer = Integer.parseInt(br.readLine());
		network= Integer.parseInt(br.readLine());
		arr=new int[computer+1][computer+1];
		visited=new boolean[computer+1];

		for(int i=0; i<network; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());

			arr[a][b]=arr[b][a]=1;

		}
		dfs(1);

		System.out.println(count-1);

	}
	public static void dfs(int start){
		visited[start]=true;
		count++;

		for(int i=0; i<=computer; i++){
			if(!visited[i]&&arr[start][i]==1){
				dfs(i);
			}
		}
	}
}