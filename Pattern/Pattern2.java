package Pattern;

////      * * * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *


public class Pattern2 {
    public static void main(String[] args) {

        int n=5;
        pattern(n);
    }

    static void pattern(int n){
        for (int row = 0; row <n; row++) {

            for (int col = 0; col <=n-row+1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
