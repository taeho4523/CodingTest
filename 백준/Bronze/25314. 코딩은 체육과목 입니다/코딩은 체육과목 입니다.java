import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int c=b/4;
        String l="";
        for(int i=0; i<c; i++) {
            l+="long ";
        }
        System.out.println(l +"int");
    }
}