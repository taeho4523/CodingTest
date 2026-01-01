import java.io.*;
import java.util.*;


public class Main {
    static char[][] arr;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        arr = new char[n][n * 2 - 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(arr[i], ' ');
        }
        star(n - 1, 0, n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2 - 1; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }


        static void star(int x,int y,int n){
            if (n == 3) {
                arr[y][x] = '*';
                arr[y + 1][x - 1] = '*';
                arr[y + 1][x + 1] = '*';
                arr[y + 2][x - 2] = '*';
                arr[y + 2][x - 1] = '*';
                arr[y + 2][x] = '*';
                arr[y + 2][x + 1] = '*';
                arr[y + 2][x + 2] = '*';
                return;
            } else {
                int size = n / 2;
                star(x, y, size);
                star(x - size, y + size, size);
                star(x + size, y + size, size);
            }
        }
    }