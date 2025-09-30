
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        int[] trees = new int[N];
        st = new StringTokenizer(br.readLine());
        int max_height = 0;
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            if (trees[i] > max_height) {
                max_height = trees[i];
            }
        }

        long low = 0;
        long high = max_height;
        long ans = 0;

        while (low <= high) {
            long mid = (low + high) / 2;
            long totalWood = 0;

            for (int tree_height : trees) {
                if (tree_height > mid) {
                    totalWood += tree_height - mid;
                }
            }

            if (totalWood >= M) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(ans);
    }
}