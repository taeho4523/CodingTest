
import java.util.*;
import java.io.*;

class Main {

	static class Node{
		int value;
		int index;
		Node(int value, int index){
			this.value=value;
			this.index=index;
		}
	}
	public static void main(String[] args) throws IOException {
		//귀찮음 방지용 문제적어놓기 D_i=A_i-L+1~A_i중 최솟값. D에 저장된 값 출력하는 프로그램. i<=0은 무시.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int L=Integer.parseInt(st.nextToken());
		int[] arr=new int[N];
		int[] D=new int[N];
		//deque사용하여해결
		Deque<Node> dq=new ArrayDeque<>();

		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++){
			arr[i]=Integer.parseInt(st.nextToken());

			while(!dq.isEmpty()&&dq.getLast().value>arr[i]){
				dq.removeLast();
			}

			dq.addLast(new Node(arr[i],i));

			if(dq.getFirst().index<i-L+1){
				dq.removeFirst();
			}

			D[i]=dq.getFirst().value;
		}
		for(int i=0; i<N; i++){
			bw.write(D[i]+" ");
		}
		bw.flush();
		br.close();
		bw.close();


	}
}