import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int bascket=sc.nextInt();
       int n=sc.nextInt();
       int[] arr=new int[bascket];
       for(int i=0; i<n; i++){
           int bascket1=sc.nextInt();
           int bascket2=sc.nextInt();
           int ball=sc.nextInt();
           for(int j=bascket1-1; j<=bascket2-1; j++){
                arr[j]=ball;
           }
       }
       for(int i=0; i<bascket; i++){
           System.out.print(arr[i]+" ");
       }
    }
}