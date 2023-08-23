package Array;

import java.util.Scanner;

// find the last occurrence of an element x in given array
public class LastOccurrence {

    static int findOccurrence(int[] arr, int x){
        int lastindex=-1;
        for (int i=0;i< arr.length;i++){
            if(arr[i]==x){
                lastindex=i;
            }
        }
        return lastindex;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n= sc.nextInt();

        int[] arr=new int[n];

        System.out.println("Enter elements in array: ");
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the value of x: ");
        int x=sc.nextInt();

        System.out.println("Lastindex of Occurrence is: "+findOccurrence(arr,x));

    }
}
