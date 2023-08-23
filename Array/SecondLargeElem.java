package Array;

public class SecondLargeElem {
    public static void main(String[] args) {

        int[] arr={2,3,6,4,7,4,7,6,8};

        //logic for secondLarget element
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

        System.out.println("scondmax: "+arr[1]);
    }
}
