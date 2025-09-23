
import java.io.*;
import java.util.*;

class Main {
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static int N, M, K, count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken()); // 가로(열)
			N = Integer.parseInt(st.nextToken()); // 세로(행)
			K = Integer.parseInt(st.nextToken()); // 배추 개수

			arr = new int[N][M];
			visited = new boolean[N][M];
			count = 0;

			for (int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken()); // 가로(열)
				int y = Integer.parseInt(st.nextToken()); // 세로(행)
				arr[y][x] = 1;
			}

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < M; c++) {
					if (!visited[r][c] && arr[r][c] == 1) {
						dfs(r, c);
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}

	private static void dfs(int x, int y) {
		visited[x][y] = true;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
				if (!visited[nx][ny] && arr[nx][ny] == 1) {
					dfs(nx, ny);
				}
			}
		}
	}
}
