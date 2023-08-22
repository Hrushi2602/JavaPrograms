package Pattern;

//0
//0 1
//0 1 2
//0 1 2 3
//0 1 2 3 4

public class Pattern3 {

    static void pattern(int n){
        for (int row = 0; row <n; row++) {
            for (int col = 0; col <=row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        pattern(n);
    }
}
