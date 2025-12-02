import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        digitSum();
        powered();
        random();

    }

    public static void digitSum(){
        int total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a series of number to sum :");

        String num = scan.next();
        for (int i=0; i < num.length(); i++){
            total += Character.getNumericValue(num.charAt(i));
        }

        System.out.println("The total is " + total + ".");
    }

    public static void powered(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number :");
        int base = scan.nextInt();
        System.out.print("Powered : ");
        int power = scan.nextInt();
        int result = base;

        for (int i = 1; i<power; i++ ){
            result *= base;
        }
        System.out.println(base + " powered " + power + " is " + result + ".");

    }

    public static void random(){
        Random rand = new Random();

        System.out.println(rand.nextInt(20) + 1);

    }



}