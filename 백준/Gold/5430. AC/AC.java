import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            char[] commands = br.readLine().toCharArray();
            int n = Integer.parseInt(br.readLine());

            String input = br.readLine();
            input = input.substring(1, input.length() - 1);
            Deque<Integer> deque = new ArrayDeque<>();

            if (!input.isEmpty()) {
                for (String num : input.split(",")) {
                    deque.add(Integer.parseInt(num));
                }
            }

            boolean reversed = false;
            boolean error = false;

            for (char cmd : commands) {
                if (cmd == 'R') {
                    reversed = !reversed;
                } else {
                    if (deque.isEmpty()) {
                        error = true;
                        break;
                    }
                    if (reversed) deque.removeLast();
                    else deque.removeFirst();
                }
            }

            if (error) {
                output.append("error\n");
                continue;
            }

            output.append("[");
            if (!deque.isEmpty()) {
                if (reversed) {
                    while (!deque.isEmpty()) {
                        output.append(deque.removeLast());
                        if (!deque.isEmpty()) output.append(",");
                    }
                } else {
                    while (!deque.isEmpty()) {
                        output.append(deque.removeFirst());
                        if (!deque.isEmpty()) output.append(",");
                    }
                }
            }
            output.append("]\n");
        }

        System.out.print(output);
    }
}
