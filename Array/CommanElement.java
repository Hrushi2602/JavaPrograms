package Array;

import java.util.*;

public class CommanElement {
    public static void main(String[] args) {

        int[] arr1={8,6,7,8,4,9,4,2};
        int []arr2={3,45,6,6,5,7,8,9};

        Set<Integer> com;
        com = new HashSet<>();

        //Logic for comman element from two array
        for (int a = 0; a < arr1.length; a++) {
            for (int i = 0; i < arr2.length; i++) {

                if(arr1[a]==arr2[i]){
                   com.add(arr1[a]) ;
                   break;
                }
            }

        }
        System.out.println(com);
    }
}
