import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int top = -1;

        int K = Integer.parseInt(br.readLine());
        int[] arr = new int[K];


        for(int i = 0; i < K; i++) {

            int number = Integer.parseInt(br.readLine());

            if (number == 0) {
                top--;
            }
            else {
                top++;
                arr[top] = number;
            }
        }
        int sum = 0;
        for (int i = 0; i <= top; i++) {
            sum += arr[i];
        }
        bw.write(String.valueOf(sum));
        bw.flush();

    }
}
