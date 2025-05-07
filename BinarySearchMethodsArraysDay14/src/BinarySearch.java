import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args){
        int[] originalArray = {10,9,7,8,5,6,4,2,3,1,13,11,12};
        Arrays.sort(originalArray);
        System.out.println("Sorted Arrays: " + Arrays.toString(originalArray));
        int target = 14;
        int result = binaryResult(originalArray,target);

        //if statement to exclude those results with -1
        if(result==-1){
            System.out.println("The number provided is not in the array. ");
        } else{
            System.out.println("The index for " + target + " is " + result);
        }

    }

    public static int binaryResult(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        //the while loop running to identify the index

        while(low<=high){
            //get the midpoint
            int mid = low + (high-low)/2;

            //we check if the mid is the target
            if(arr[mid] == target){
                return mid;
            } //we add 1 to the low to move the mid to the right
            else if (arr[mid] < target) {
                low = mid + 1;
            } else{ //we move mid to the left if mid is greater than target
                high = mid - 1;
            }


        }
        return -1; // this indicates value not in the array
    }
}
