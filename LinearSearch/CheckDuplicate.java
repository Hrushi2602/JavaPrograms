package LinearSearch;

public class CheckDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2,3,4,5,6,7};
        CheckDuplicateSortig(arr);

    }

    //Check in sorted array any duplicate element present or not any
    static void CheckDuplicateSortig(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("duplicate number is " + arr[i]);
                return;
            }
        }
        System.out.println("There is no duplicate is present");
    }

}
