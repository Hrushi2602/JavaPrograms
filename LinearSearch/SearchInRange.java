package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {

        int[] arr={12,3,34,65,78,-4,64,6};
        int target=6;
        System.out.println(LinearSearch(arr,target,1,4));
    }
    static int LinearSearch(int []arr, int target,int start, int end){
        if(arr.length == 0){
            return -1;
        }
        //run the for loop
        for (int index = start; index <= end; index++) {
            int element=arr[index];
            if (element == target){
                return index;
            }
        }
        //if element is not found then return -1
        return -1;
    }
}
