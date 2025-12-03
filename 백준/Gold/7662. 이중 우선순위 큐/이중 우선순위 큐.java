import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            int input = Integer.parseInt(br.readLine());
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int j = 0; j < input; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String op = st.nextToken();

                if (op.equals("I")) {
                    int num = Integer.parseInt(st.nextToken());
                    map.put(num, map.getOrDefault(num, 0) + 1);
                } else {
                    if (map.size() == 0) continue;
                    int type = Integer.parseInt(st.nextToken());
                    int num;
                    if (type == 1) {
                        num = map.lastKey();
                    } else {
                        num = map.firstKey();
                    }
                    if (map.put(num, map.get(num) - 1) == 1) {
                        map.remove(num);
                    }
                }
            }

            if (map.size() == 0) {
                System.out.println("EMPTY");
            } else {
                System.out.println(map.lastKey() + " " + map.firstKey());
            }
        }

    }
}