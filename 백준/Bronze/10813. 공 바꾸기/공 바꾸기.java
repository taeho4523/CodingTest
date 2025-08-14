import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int bascket=sc.nextInt();
       int n=sc.nextInt();
       int[] arr=new int[bascket];
       int count=1;
       for(int i=0;i<bascket;i++){
           arr[i]=count;
           count++;
       }
       for(int i=0; i<n; i++){
           int bascket1=sc.nextInt();
           int bascket2=sc.nextInt();
           int temp;
           temp=arr[bascket1-1];
           arr[bascket1-1]=arr[bascket2-1];
           arr[bascket2-1]=temp;
       }
       for(int i=0; i<bascket; i++){
           System.out.print(arr[i]+" ");
       }
    }
}