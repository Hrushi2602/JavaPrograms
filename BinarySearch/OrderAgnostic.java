package BinarySearch;

public class OrderAgnostic {
    public static void main(String[] args) {

        //int [] arr={22,45,67,88,88,98,102};
        int [] arr={56,45,35,26,10,7,-6,-9};
        int target=7;
        int ans= binarySearchAsc(arr,target);
        System.out.println(ans);

    }
    static int binarySearchAsc(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //find whether array is sorted in assecnding or dessending
        boolean isAsc= arr[start] < arr[end];

            while (start <= end) {
                int mid=start + (end-start)/2;

                if(target == arr[mid]){
                    return mid;
                }

                if(isAsc) {
                    if (target > arr[mid]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
                else {
                    if (target < arr[mid]) {
                        start = mid +1;
                    } else {
                        end= mid- 1;
                    }
                }
        }
        return -1;
    }
}
