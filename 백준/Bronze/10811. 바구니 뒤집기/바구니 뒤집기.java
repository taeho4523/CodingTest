import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       int[] arr=new int[n];
       for(int i = 0; i < n; i++) {
           arr[i]=i+1;
       }
       for(int i=0; i<m; i++){
           int a = sc.nextInt();
           int b = sc.nextInt();
           reverseArray(arr,a-1,b-1);
       }
       for(int i=0; i<n; i++){
           System.out.print(arr[i]+" ");
       }
    }
    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}