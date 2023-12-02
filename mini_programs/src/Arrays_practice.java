import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrays_practice {
    public static void main(String[] args) {
//        roll_dice();
//        math_exam();
        sample();
    }

    public static void roll_dice(){
        Random rand = new Random();
        boolean flag = true;
        int count = 0;

        while(flag){
            int x = rand.nextInt(1, 7);
            int y = rand.nextInt(1, 7);

            System.out.println("Roll : " + x + "+" + y + "= " + (x+y));
            count ++;
            if (x+y == 7){
                flag = false;
                System.out.println("You have won after " + count + " times.");
                System.out.println();
            }
        }
    }

    public static void math_exam(){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int ans = 0;
        int count = 0;
        int result = 0;

        do{
            int x = rand.nextInt(1, 21);
            int y = rand.nextInt(1, 21);
            result = x*y;
            System.out.print(x + " * " + y + " = ");
            ans = scan.nextInt();

            if (ans != result){
                System.out.println("Incorrect...'\nThe correct answer is "+ result + ".");
                System.out.println("You solved "+ count + " correctly.");
                break;
            }
            count++;

        }while(true);

    }

    public static void sample(){
        int[] array1 = new int[10];

        int[] array2 = {5,4,3,2,1}; //no need to declare array size
        System.out.println(Arrays.toString(array1));

        int[] array3 = new int[]{10,9,8,7,6};  //no need to declare array size

        int[] array4;
        array4 = new int[3];

        int x = 2;
        int y;
        y = x << 2;
        System.out.println(y);
    }

}