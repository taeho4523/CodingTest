import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < N; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }
        int total=0;
        while(pq.size() > 1) {
            int first=pq.poll();
            int second=pq.poll();
            int sum=first+second;

            total+=sum;
            pq.add(sum);

        }
        System.out.println(total);
    }

}
