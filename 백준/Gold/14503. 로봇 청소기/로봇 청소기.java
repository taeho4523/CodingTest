import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int dir = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        int result = 0;

        while (true) {
            if (arr[r][c] == 0) {
                arr[r][c] = 2;
                result++;
            }

            boolean moved = false;
            for (int i = 0; i < 4; i++) {
                dir = (dir + 3) % 4;
                int nr = r + dr[dir];
                int nc = c + dc[dir];
                if (arr[nr][nc] == 0) {
                    r = nr;
                    c = nc;
                    moved = true;
                    break;
                }
            }

            if (!moved) {
                int backDir = (dir + 2) % 4;
                int nr = r + dr[backDir];
                int nc = c + dc[backDir];
                if (arr[nr][nc] == 1) {
                    break;
                }
                r = nr;
                c = nc;
            }
        }

        System.out.println(result);
    }
}
