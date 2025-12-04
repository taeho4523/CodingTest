import java.io.*;
import java.util.*;


public class Main {
    static boolean[] visited;
    static int a,b;
    static class Pair{
        int num;
        String command;

        Pair(int num, String command){
            this.num = num;
            this.command = command;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            System.out.println(bfs(a));
        }
    }

    static String bfs(int number){
        Queue<Pair> q = new LinkedList<>();
        visited=new boolean[10000];
        q.add(new Pair(number,""));
        visited[number]=true;

        while(!q.isEmpty()){
            Pair p = q.poll();
            if(p.num==b) return p.command;

            int temp = p.num;

            int D = (temp * 2) % 10000;
            if (!visited[D]) {
                visited[D] = true;
                q.add(new Pair(D, p.command + "D"));
            }

            int S = (temp == 0) ? 9999 : temp - 1;
            if (!visited[S]) {
                visited[S] = true;
                q.add(new Pair(S, p.command + "S"));
            }

            int L = (temp % 1000) * 10 + temp / 1000;
            if (!visited[L]) {
                visited[L] = true;
                q.add(new Pair(L, p.command + "L"));
            }

            int R = (temp % 10) * 1000 + temp / 10;
            if (!visited[R]) {
                visited[R] = true;
                q.add(new Pair(R, p.command + "R"));
            }
        }
            return "";
    }
}