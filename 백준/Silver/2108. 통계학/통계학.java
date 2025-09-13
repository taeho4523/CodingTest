import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine().trim());
        int[] freq = new int[8001];
        int min = 4001, max = -4001;
        long sum = 0;

        for (int i = 0; i < N; i++) {
            int v = Integer.parseInt(br.readLine().trim());
            sum += v;
            freq[v + 4000]++;
            if (v < min) min = v;
            if (v > max) max = v;
        }


        int mean = (int) Math.round(sum / (double) N);


        int median = 0;
        int count = 0;
        int target = (N + 1) / 2;
        for (int i = 0; i < freq.length; i++) {
            count += freq[i];
            if (count >= target) {
                median = i - 4000;
                break;
            }
        }


        int maxFreq = 0;
        for (int f : freq) if (f > maxFreq) maxFreq = f;

        List<Integer> modes = new ArrayList<>();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == maxFreq) modes.add(i - 4000);
        }
        int mode = (modes.size() == 1) ? modes.get(0) : modes.get(1);


        int range = max - min;
        bw.write(String.valueOf(mean)+"\n");
        bw.write(String.valueOf(median)+"\n");
        bw.write(String.valueOf(mode)+"\n");
        bw.write(String.valueOf(range)+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
