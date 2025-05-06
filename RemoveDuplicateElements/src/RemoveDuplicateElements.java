import java.util.Arrays;

public class RemoveDuplicateElements {
    public static void main(String[] args){

        int[] array1 = {1,1,1,2,3,3,2,4,4,6,5,6,6,7,8,8,9,8,11,11,10,10};
        int[] uniqueArray = removeDups(array1);
        System.out.println("The new array after removing duplicates is : " + Arrays.toString(uniqueArray));

    }
    public static int[] removeDups(int[] arr){

        //always consider cases where something is empty
        if (arr == null || arr.length<=1){
            return arr;

        }

        //we sort the array
        Arrays.sort(arr);

        int[] tempArray = new int[arr.length];
        //create temporary index for the temporary array
        int j = 0;

        // Iterate over the array and copy unique elements to the temporary array

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] != arr[i+1]){
                tempArray[j++] = arr[i];


            }
        }
        // Copy the last element as it was not checked in the loop
        tempArray[j++] = arr[arr.length-1];

        // Create a result array with the size of unique elements
        int[] result = new int[j]; // we have been incrementing the j
        for (int i = 0; i < j; i++) {
            result[i] = tempArray[i];
        }
       // System.arraycopy(tempArray, 0, result, 0, j); //short for the for loop
        return result;




    }
}
