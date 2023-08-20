import java.util.Scanner;
//count the number of occurrence in perticular array
public class Occurrence {

    //method for countOccurrence logic
    static int countOccurrence(int[] arr,int x){
        int count=0;
        for (int i=0;i< arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n= sc.nextInt();

        int []arr=new int[n];
        System.out.println("Enter the element in array: ");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the value of X: ");
        int x= sc.nextInt();

        System.out.println("count of x: "+countOccurrence(arr,x));

    }
}
