import java.io.*;
import java.util.*;

class Node{
    int x;
    int time;

    public Node(int x, int time){
        this.x = x;
        this.time = time;
    }
}
public class Main {
    static boolean[] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visited= new boolean[100001];

        Queue<Node> queue = new LinkedList<>();
        int result=Integer.MAX_VALUE;
        queue.offer(new Node(N,0));
        visited[N] = true;
        while(!queue.isEmpty()){
            Node node= queue.poll();
            int x= node.x;
            int time= node.time;

            visited[x] = true;
            if(x==M) result=Math.min(result,time);

            if(x*2<=100000&&visited[x*2]==false) queue.offer(new Node(x*2, time));
            if(x+1<100000&&visited[x+1]==false) queue.offer(new Node(x+1, time+1));
            if(x-1>=0&&visited[x-1]==false) queue.offer(new Node(x-1, time+1));



        }
        System.out.println(result);



    }

}