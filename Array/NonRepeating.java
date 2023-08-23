package Array;

public class NonRepeating {
    public static void main(String[] args) {

        int[] arr =new int[5];
            int nonRepating=0;
            boolean isRepeating=false;

            for (int i = 0; i < arr.length ; i++) {
                for (int j = i+1; j < arr.length ; j++) {

                    if (arr[i]==arr[j]){
                        isRepeating=true;
                        break;
                    }
                    if (!isRepeating){
                        nonRepating= arr[i];
                        break;
                    }
                }
                System.out.println(arr[i]);
            }
        }

    }

