import java.util.Scanner;

public class My_investment{
    public static void main(String[] args){
        double balance = 250000;
        double total_balance = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("How many years will you wait? :");
        int year = scan.nextInt();

        for (int i =0; i<year; i++){
            total_balance = fix_deposit(balance) + mutual_fund(balance) + crypto_currency(balance);
            balance = total_balance;
        }

        System.out.println("Total Account Balance after " + year + " years is " + total_balance + " Dollars.");

    }

    public static double fix_deposit(double balance){
        balance = balance / 2;
        double interest_rate = 2.5;
        return balance + (balance * interest_rate)/100;

    }

    public static double mutual_fund(double balance){
        balance = (balance * 3)/10;
        byte interest_rate = 4;
        return balance + (balance * interest_rate)/100;

    }

    public static double crypto_currency(double balance){
        balance = balance / 5;
        byte interest_rate = 14;
        return balance + (balance * interest_rate)/100;

    }
}