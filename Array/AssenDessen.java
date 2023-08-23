package Array;

public class AssenDessen {
    public static void main(String[] args) {

        int[] arr = {2, 4, 56, 4, 75, 24, 77, 45, 78, 8};

        System.out.println("=================");

        //sorting in assending order

        int maxNum = arr[0];
        int minNum=arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

        System.out.println("=================");

        // logic for dessending order

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

        // maxnumber in unsorted array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > maxNum) {
                    maxNum = arr[i];
                }
            }
        }
        System.out.println("maxNumber is: "+maxNum);

        //min  in unsorted array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < minNum) {
                    minNum = arr[i];
                }
            }
        }
        System.out.println("maxNumber is: "+minNum);
    }
}