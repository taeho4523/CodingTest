
import java.io.*;
import java.util.*;

class Main {
	public static class Node {
		int e, cost;
		Node(int e, int cost) {
			this.e = e;
			this.cost = cost;
		}
	}

	static int node;
	static int max = 0;
	static boolean[] visited;
	static ArrayList<Node>[] list;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		list = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) list[i] = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int point = Integer.parseInt(st.nextToken());
			while (true) {
				int line_num = Integer.parseInt(st.nextToken());
				if (line_num == -1) break;
				int length = Integer.parseInt(st.nextToken());
				list[point].add(new Node(line_num, length));
			}
		}

		visited = new boolean[N + 1];
		visited[1] = true;
		dfs(1, 0);     

		visited = new boolean[N + 1];
		max = 0;
		visited[node] = true;
		dfs(node, 0);

		System.out.println(max);
	}

	public static void dfs(int x, int length) {
		if (length > max) {
			max = length;
			node = x;
		}
		for (Node n : list[x]) {
			if (!visited[n.e]) {
				visited[n.e] = true;
				dfs(n.e, length + n.cost);
			}
		}
	}
}
