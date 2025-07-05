import java.util.Objects;
import java.util.Scanner;

public class GPA {
    public static void main(String[] args)
    {
        gpa_calculator();
    }

    public static void gpa_calculator(){
        Scanner scan = new Scanner(System.in);
        double gpa = 0;
        double credit_x_gpa = 0;
        int total_credit = 0;

        for (int i = 0; i < 8; i++){
            System.out.print("Enter a major code :");
            String major_code = scan.next();

            System.out.print("Enter the number of credits for this major :");
            int credit = scan.nextInt();
            total_credit += credit;

            System.out.print("Enter GPA Grade :(A, B+, B, ...");
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
}
