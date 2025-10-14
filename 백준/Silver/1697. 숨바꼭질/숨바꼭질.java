import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        if (n == k) {
            System.out.println(0);
            return;
        }

        boolean[] visited = new boolean[100001];
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        visited[n] = true;
        int count = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int x = q.remove();

                if (x == k) {
                    System.out.println(count);
                    return;
                }

                if (x - 1 >= 0 && !visited[x - 1]) {
                    visited[x - 1] = true;
                    q.add(x - 1);
                }
                if (x + 1 <= 100000 && !visited[x + 1]) {
                    visited[x + 1] = true;
                    q.add(x + 1);
                }
                if (x * 2 <= 100000 && !visited[x * 2]) {
                    visited[x * 2] = true;
                    q.add(x * 2);
                }
            }
            count++;
        }
    }
}
