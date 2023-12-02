import java.util.Scanner;
import java.io.*;

public class ch_5 {
    public static void main(String[] args) {
        working_hour();
        DrawDiamond();
    }

    public static void working_hour(){
        Scanner scan = new Scanner(System.in);

        System.out.print("How many employees are there? ");
        int num = scan.nextInt();
        int total_hour = 0;

        for (int i = 1; i<=num; i++){
            int hour = 0;

            System.out.print("Employee " + i + ": How many days?");
            int day = scan.nextInt();

            for (int j = 0; j< day; j++){
                System.out.print("Hours? ");
                hour += scan.nextInt();
            }

            System.out.println("Employee " + i + "'s total paid hours = " + hour);
            System.out.println();
            total_hour += hour;
        }
        System.out.println("============================");
        System.out.println("Total paid hours for all employees = " + total_hour);
    }


    public static void DrawDiamond(){

        System.out.println();
        String dot = "....";
        String space = " ";

        System.out.println("#================#");

        for (int i =0; i<4; i++){
            System.out.print("|");

            for (int k = 0; k<3-i ;k++){
                System.out.print(space.repeat(2));
            }

            System.out.print("<>");
            System.out.print(dot.repeat(i));
            System.out.print("<>");

            for (int k = 0; k<3-i ;k++){
                System.out.print(space.repeat(2));
            }

            System.out.println("|");

        }

        for (int j = 3; j>=0; j--){
            System.out.print("|");

            for (int k =0; k<3-j;k++){
                System.out.print(space.repeat(2));
            }

            System.out.print("<>");
            System.out.print(dot.repeat(j));
            System.out.print("<>");


            for (int k =0; k<3-j;k++){
                System.out.print(space.repeat(2));
            }

            System.out.println("|");

        }
        System.out.println("#================#");
    }
}
