import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class file_handling {
    public static void main(String[] args) throws FileNotFoundException {
        weather_array();
        reverse_order();
        even_number();
        file_handle();
        file_input();
        line_based();

    }

    public static void weather_array(){
        Scanner scan = new Scanner(System.in);
        float total = 0;
        int count = 0;

        System.out.print("How many days' temperatures? :");
        int day = scan.nextInt();
        float myArr[] = new float[day];

        for (int i =0; i<day; i++){

            System.out.print("Day " + (i+1) + "'s high temperature :");
            float temp = scan.nextFloat();
            myArr[i] = temp;
        }

        for (int i = 0; i<myArr.length; i++){
            total += myArr[i];
        }

        float average = (total/myArr.length);
        System.out.println("Average temperature :" + average);

        for (int i = 0; i<myArr.length; i++){
            if(average < myArr[i]){
                count++;
            }
        }

        System.out.println(count + " days have above-average temperatures.");
        System.out.println();

    }

    public static void reverse_order(){
        int arr[] = new int[100];
        for (int i = 0; i<arr.length; i++){
            arr[i] = i+1;
        }
        System.out.println("Printing the first hundred positive numbers in reverse order.");
        for (int i = arr.length-1; i>=0;i--){
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void even_number(){
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[10];;
        int count = 0;

        for (int i =0; i<arr.length;i++){
            System.out.print("Enter " + (i+1) + "st positive integer :");
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i<arr.length; i++){
            if (arr[i] % 2 == 0){
                count ++;
            }
        }
        System.out.println("There are " + count + " even numbers.");

    }

    public static void file_handle() throws FileNotFoundException {


        Scanner input = new Scanner(new File("D:\\number.txt"));
        int total = 0;
        int num = 0;

        while(input.hasNextInt()){
            num = input.nextInt();
            System.out.println(num);
            total += num;
        }

        System.out.println("Total is " + total);
    }

    public static void file_input() throws FileNotFoundException{
        Scanner input = new Scanner(new File("D:\\number0.txt"));
        double sum = 0;

        while (input.hasNext()){

            if(input.hasNextDouble()){
                double x = input.nextDouble();
                System.out.println(x);
                sum += x;
            }else{
                input.next();
            }

        }
        System.out.println("Sum is " + sum + ".");

    }

    public static void line_based() throws FileNotFoundException{
        int i = 0;
        int[] myArr = new int[i];

        int total = 0;
        int count = 0;

        Scanner input = new Scanner(new File ("D:\\number0.txt"));

        while(input.hasNextLine()){
            String line = input.nextLine();
            System.out.println(line);

            Scanner linescan = new Scanner(line);

            while (linescan.hasNext()){

                if (linescan.hasNextInt()){
                    int x = linescan.nextInt();
                    myArr[i] = x;
                    i++;
                }else{
                    linescan.next();
                }


            }
            System.out.println("===============");
        }

        System.out.println(Arrays.toString(myArr));
        for (int j = 0; j< myArr.length; j++ ){
            total += myArr[j];
            count++;
        }

        System.out.println("Average mark is " + total/count);

    }

}
