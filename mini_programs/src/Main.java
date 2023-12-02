import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        gpa();
//        digitSum();
        powered();
//        random();

    }

    public static void gpa(){
        Scanner scan = new Scanner(System.in);
        double gpa = 0;
        double credit_x_gpa = 0;
        int total_credit = 0;

        for (int i=0; i<8;i++){
            System.out.print("Enter a major code :");
            String major_code = scan.next();

            System.out.print("Enter the nuber of credits for this major :");
            int credit = scan.nextInt();
            total_credit += credit;

            System.out.print("Enter GPA Grade :(A or A+ or B...");
            String grade = scan.next();

            if (Objects.equals(grade, "A")){
                gpa = 4.0;
            }else if (Objects.equals(grade, "B+")){
                gpa = 3.5;
            }else if (Objects.equals(grade, "B")){
                gpa = 3;
            }else if (Objects.equals(grade, "C+")){
                gpa = 2.5;
            }else if (Objects.equals(grade, "C")){
                gpa = 2.0;
            }else if (Objects.equals(grade, "D+")){
                gpa = 1.5;
            }else if (Objects.equals(grade, "D")){
                gpa = 1.0;
            }else{
                gpa = 0;
            }

            credit_x_gpa += credit * gpa;

        }

        System.out.println("Average GPA Result = " + credit_x_gpa/total_credit);
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