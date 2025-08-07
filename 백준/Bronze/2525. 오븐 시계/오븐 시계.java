import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int minute = a*60+b;
        minute +=c;

        int hour = (minute/60)%24;
        int miniute = minute%60;

        System.out.println(hour +" "+miniute);
    }
}