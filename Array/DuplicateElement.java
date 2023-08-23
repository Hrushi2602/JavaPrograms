package Array;

public class DuplicateElement {
    public static void main(String[] args) {

        int [] arr={1,2,3,4,2,3,5,6,2,7};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {

                if (arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }

            }

        }
    }
}
