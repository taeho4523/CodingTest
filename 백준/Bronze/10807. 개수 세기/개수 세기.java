import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int a= scanner.nextInt();
       int result=0;
       int[] arr=new int[a];
       for(int i=0;i<a;i++){
           int b= scanner.nextInt();
           arr[i]=b;
       }
       int c= scanner.nextInt();
       for(int i=0;i<arr.length;i++){
           if(arr[i]==c){
               result+=1;
           }
       }
       System.out.println(result);
    }
}