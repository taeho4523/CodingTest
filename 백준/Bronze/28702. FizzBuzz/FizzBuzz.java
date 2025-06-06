import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fizzbuzz=new String[3];

        int num;
        for(int i=0; i< fizzbuzz.length; i++){
            fizzbuzz[i]= scanner.nextLine();
        }
        if(!fizzbuzz[0].equals("Fizz")&&!fizzbuzz[0].equals("Buzz")&&!fizzbuzz[0].equals("FizzBuzz")){
            num=Integer.parseInt(fizzbuzz[0])+ fizzbuzz.length;
        } else if (!fizzbuzz[1].equals("Fizz")&&!fizzbuzz[1].equals("Buzz")&&!fizzbuzz[1].equals("FizzBuzz")) {
            num=Integer.parseInt(fizzbuzz[1])+ fizzbuzz.length-1;
        } else if (!fizzbuzz[2].equals("Fizz")&&!fizzbuzz[2].equals("Buzz")&&!fizzbuzz[2].equals("FizzBuzz")) {
            num=Integer.parseInt(fizzbuzz[2])+ fizzbuzz.length-2;
        } else num=-1;

        if(num%3==0&&num%5==0){
            System.out.println("FizzBuzz");
        } else if (num%3==0){
            System.out.println("Fizz");
        } else if (num%5==0){
            System.out.println("Buzz");
        } else System.out.println(num);

    }

}