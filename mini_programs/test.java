import java.util.*;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        // static arrays
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr0 = new int[5];

        // dynamic arrs
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(5);
        arr1.add(4);

        printArrayList(arr1);
        // printArray(arr0);

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void printArrayList(ArrayList arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
