public class Finding_digits {
    public static void main(String[] args) {
        last_digit();
        last_4_digits();
        second_to_last_digit();

        System.out.println("There are " + numUnique(1,2,3) + " Unique numbers.");
    }

    public static void last_digit(){
        int x = 2554;
        String str = Integer.toString(x);
        int n = str.length();
        System.out.println(str.charAt(n-1));
    }

    public static void last_4_digits(){
        long x = 25647895;
        String str = Long.toString(x); //converting a long to a string
        int n = str.length();

        for (int i =n-4; i<n; i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static void second_to_last_digit(){
        int x = 255;
        String str = Integer.toString(x); //converting an integer to a string
        int n = str.length();

        System.out.println(str.charAt(n-2));
    }

    public static int numUnique ( int x, int y, int z){

        if (x != y && y != z && x != z) {
            return 3;

        } else if (x == y && x == z) {
            return 1;

        } else {
            return 2;
        }

    }

}