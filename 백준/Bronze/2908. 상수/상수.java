import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int b = sc.nextInt();
      int c = sc.nextInt();

      int a1=swap(b);
      int a2=swap(c);
      if(a1>a2){
          System.out.println(a1);
      } else if(a2>a1){
          System.out.println(a2);
      } else {
          System.out.println("ERROR");
      }

    }
    private static int swap(int a) {
        String str = new StringBuilder(String.valueOf(a)).reverse().toString();
        return Integer.parseInt(str);
    }
}