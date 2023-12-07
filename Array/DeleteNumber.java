package Array;
import java.util.*;
public class DeleteNumber {
    public static void main(String[] args) {

        int arr[]= new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value in array");

        for (int i = 0; i < arr.length ; i++) {
              arr[i]=sc.nextInt();
        }

        System.out.println("Enter the index which is you want to delete");
        int DeleteIndex= sc.nextInt();

        for (int i = 0; i < arr.length; i++) {

            if(i == DeleteIndex){
                for (int j = i; j < arr.length-1; j++) {
                    arr[j]=arr[j+1];
                }
                break;
            }

            }
        System.out.println("Remove array is");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i]);
        }
        }
    }


