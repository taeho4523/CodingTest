import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new char[N][M];
        visited = new boolean[N][M];
        int startX = 0, startY = 0;
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'I') {
                    startX = i;
                    startY = j;
                }
            }
        }
        int cnt = bfs(startX, startY);
        if (cnt == 0) {
            System.out.println("TT");
        } else {
            System.out.println(cnt);
        }
    }

    static int bfs(int sx, int sy) {
        int count = 0;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sx, sy});
        visited[sx][sy] = true;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                if (visited[nx][ny]) continue;
                if (map[nx][ny] == 'X') continue;
                visited[nx][ny] = true;
                if (map[nx][ny] == 'P') {
                    count++;
                }
                q.add(new int[]{nx, ny});
            }
        }
        return count;
    }
}
