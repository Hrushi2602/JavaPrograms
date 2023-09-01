package BinarySearch;

public class SearchTarget {
    public static void main(String[] args) {

        int [] arr={12,34,54,56,67,89,98};
        int target=67;
       int ans=binarySearchAsc(arr,target);
        System.out.println(ans);
    }

    static int binarySearchAsc(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //int mid=(start+end)/2;   it may exceed the range of int in java
            int mid=start+(end-start)/2;

            if(target > arr[mid]){
                start= mid+1;
            }else if (target < arr[mid]){
                end= mid-1;
            }else {
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
