import java.util.Scanner;

public class Working_hour {
    public static void main(String[] args) {
        working_hour();
    }

    public static void working_hour(){
        Scanner scan = new Scanner(System.in);

        System.out.print("How many employees are there? ");
        int num = scan.nextInt();
        int total_hour = 0;

        for (int i = 1; i <= num; i++){
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

}
