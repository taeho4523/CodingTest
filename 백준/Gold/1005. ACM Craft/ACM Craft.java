
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase=Integer.parseInt(br.readLine());
        for(int i=0; i<testCase; i++){
            int answer=0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int towerCount= Integer.parseInt(st.nextToken());
            int ruleCount=Integer.parseInt(st.nextToken());

            List<List<Integer>> graph = new ArrayList<>();
            for(int k=0; k<=towerCount; k++){
                graph.add(new ArrayList<>());
            }


            int[] degree=new int[towerCount+1];
            int[] time=new int[towerCount+1];

            st=new StringTokenizer(br.readLine());

            for(int j=1; j<=towerCount; j++){
                time[j]=Integer.parseInt(st.nextToken());
            }
            for(int j=0; j<ruleCount; j++){
                st=new StringTokenizer(br.readLine());
                int X=Integer.parseInt(st.nextToken());
                int Y=Integer.parseInt(st.nextToken());
                graph.get(X).add(Y);
                degree[Y]++;
            }

            Queue<Integer> queue=new LinkedList<>();
            int[] dp = new int[towerCount+1];
            for(int j=1; j<=towerCount; j++){
                if(degree[j]==0){
                    queue.offer(j);
                }
                dp[j]=time[j];
            }

            while(!queue.isEmpty()){
                int x=queue.poll();

                for(int next:graph.get(x)){
                    degree[next]--;
                    dp[next]=Math.max(dp[next],dp[x]+time[next]);
                    if(degree[next]==0){
                        queue.offer(next);
                    }
                }
            }


            int win=Integer.parseInt(br.readLine());
            System.out.println(dp[win]);


        }

    }
}
