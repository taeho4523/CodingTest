import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,1,2,2,2,8};
        int[] arr2 = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            arr2[i] = sc.nextInt();
            arr[i] = arr[i]-arr2[i];
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}