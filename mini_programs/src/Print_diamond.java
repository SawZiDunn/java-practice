public class Print_diamond {
    public static void main(String[] args) {
        DrawDiamond();
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
