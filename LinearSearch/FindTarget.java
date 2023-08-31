package LinearSearch;

public class FindTarget {
    public static void main(String[] args) {

        int[] arr={13,45,26,76,86,85,23};
        int target=86;
        int ans = LinearSearch(arr,target);
        boolean ansele = LinearSearch2(arr, target);
        System.out.println(ans+" "+ansele);

    }
   //Search the target and return the element
    //it is for returning element
    static int LinearSearch(int []arr, int target){
        if(arr.length == 0){
            return -1;
        }
        //run the for loop
        for (int index = 0; index < arr.length; index++) {
            int element=arr[index];
            if (element == target){
                return index;
            }
        }
        //if element is not found then return -1
        return -1;
    }

    static boolean LinearSearch2(int []arr, int target){
        if(arr.length == 0){
            return false;
        }
        //run the for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        //if element is not found then return -1
        return  false;
    }
}
