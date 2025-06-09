import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String isbn = scanner.nextLine();
        String parts[] = isbn.split("");

        int starIndex=-1;
        int total=0;

        for (int i = 0; i < parts.length-1; i++) {
            if (parts[i].equals("*")) {
                starIndex = i;
                continue;
            }

            int num = Integer.parseInt(parts[i]);
            if (i % 2 == 0) {
                total += num;
            } else {
                total += 3 * num;
            }
        }

        int m = Integer.parseInt(parts[12]);


        for (int x = 0; x <= 9; x++) {
            int temp = total;

            if (starIndex % 2 == 0) {
                temp += x;
            } else {
                temp += 3 * x;
            }

            int mod = (temp + m) % 10;

            if (mod == 0) {
                System.out.println(x);
                return;
            }
        }
    }
}