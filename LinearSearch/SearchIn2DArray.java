package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {

        int [][] arr={
                {23,3,5,},
                {34,87,76,9,4},
                {43,65,78,98},
                {6,9}
        };
        int target=6;
         int[] ans=search(arr,target);// format of return value {row,col}
        System.out.println(Arrays.toString(ans));

        System.out.println(search2(arr));
    }

    static int[] search(int [][] arr, int target){

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                if(arr[row][col]== target){
                    return new int[]{row,col};
                }
                
            }
            
        }
        return new int[] {-1,-1};
    }

    static int search2(int [][] arr){

        int max=Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                if(arr[row][col] > max){
                    max=arr[row][col];
                }

            }

        }
        return max;
    }
}

