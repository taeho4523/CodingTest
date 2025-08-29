import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int a = Integer.parseInt(br.readLine());
            if(a==-1) break;
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 1; i<a ; i++) {
                if (a % i == 0) {
                    arr.add(i);
                }
            }

            int result = 0;

            for (int i = 0; i < arr.size(); i++) {
                result += arr.get(i);
            }

            if (result == a) {
                StringBuilder sb=new StringBuilder();
                sb.append(a).append(" = ");
                for (int i = 0; i < arr.size(); i++) {
                    sb.append(arr.get(i));
                    if (i < arr.size() - 1) sb.append(" + ");
                }
                System.out.println(sb);
            } else if (result != a) System.out.println(a + " is NOT perfect.");
        }

    }
}