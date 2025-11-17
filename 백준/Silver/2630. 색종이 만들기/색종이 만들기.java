import java.io.*;
import java.util.*;

public class Main {
    public static int[][] arr;
    public static int white=0;
    public static int blue=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        arr=new int[n][n];

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0,0,n);
        System.out.println(white);
        System.out.println(blue);


    }

    static void partition(int row, int col, int size){
        if(check(row,col,size)){
            if(arr[row][col]==0){
                white++;
            }
            if(arr[row][col]==1){
                blue++;
            }
            return;
        }
        int size2=size/2;

        partition(row, col, size2);
        partition(row, col + size2, size2);
        partition(row + size2, col, size2);
        partition(row + size2, col + size2, size2);
    }

    static boolean check(int row, int col, int size){
        int temp=arr[row][col];
        for(int i=row; i<row+size; i++){
            for(int j=col; j<col+size; j++){
                if(arr[i][j]!=temp){
                    return false;
                }
            }
        }
        return true;
    }
}
