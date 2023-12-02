import java.util.Arrays;
import java.util.Scanner;

public class blah {
    public static void main(String[] args) {

        isVowel();
        allDigitsOdd();
        countVowels();
        isPrime();

    }

    public static void isVowel(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a character...");
        char x = scan.next().charAt(0);

        int count = 0;
        char[] arr = new char[]{'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i<arr.length ; i++){

            if (x == arr[i]){
                count++;
            }
        }
        if (count != 0){
            System.out.println(x + " is a vowel.");
        }else{
            System.out.println(x + " is not a vowel.");
        }
    }

    public static void allDigitsOdd(){
        int count = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a bunch of numbers...");
        String x = scan.next();

        for (int i =0; i<x.length(); i++){
            int y = (Character.getNumericValue(x.charAt(i)));

            if (y % 2 != 0){
                count++;
            }
        }
        System.out.println("There are " + count + " odd numbers in your input.");

    }

    public static void countVowels(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a short phrase...");
        String x = scan.nextLine();

        int count = 0;
        char[] arr = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i<arr.length ; i++){
            for (int j = 0; j<x.length() ; j++){

                if (x.charAt(j) == arr[i] ){
                    count++;
                }
            }

        }
        System.out.println("There are " + count + " lowercase vowels in this phrase.");

    }

    public static boolean checkPrime(int x){
        if (x == 2){
            return true;
        }

        for (int i = 3; i<x; i++){
            if (x % i == 0){
                return false;
            }

        }

        return true;

    }

    public static void isPrime(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number...");

        int x = scan.nextInt();

        if (checkPrime(x)){
            System.out.println(x + " is a prime number.");

        }else{
            int x1 = x;
            while (true){
                x++;
                if (checkPrime(x)){
                    System.out.println(x1 + " is not a prime number.");
                    System.out.println("The next prime number is " + x + ".");
                    break;
                }
            }
        }
    }

}