import java.util.Arrays;
public class IntroductionToArrays {
    public static void main(String[] args){
        //Declaring an array only
        int[] numbers;
        //Initializing the array only we add size of the array inside brackets
        numbers = new int[5];
        //assigning values to the array
        //we can use manual singular addition, e.g.
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        int firstNum = numbers[4];
        System.out.println(firstNum);
        
        // we can also use a for loop
        int[] numbers2;
        numbers2 = new int[5];

        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = (i + 1) *10 ;
        }

        int secondNum = numbers2[1];
        System.out.println(secondNum);

        //declaring and initializing

        int[] numbers3 = {1,3,5,7,8};
        int thirdNumber = numbers3[2];
        System.out.println(thirdNumber);

        //ARRAY LENGTH AND FOR LOOP
        System.out.println("Here is the loop of number3 array");
        for (int i = 0; i < numbers3.length; i++) {
            numbers3[i] = numbers3[i]*10;

            System.out.println(numbers3[i]);
        }

        //FOR EACH LOOP IN ARRAYS

        String[] friends = {"Eric","Brian","Job","Samuel"};

        for (String friend:friends){
            System.out.println("Welcome " + friend);
        }

        //SUM,MIN,MAX OF AN ARRAY
        int[] itemNumbers = {10,200,30,40,55,67,44,64,5,99,100,5,35,21,4,68,90};
        int sum = 0;

        //sum
        for (int itemNumber:itemNumbers){
            sum += itemNumber;

        }
        System.out.println("The sum is " + sum);

        //max
        int maxNumber = itemNumbers[0];
        int minNumber = itemNumbers[0];

        for (int itemNumber:itemNumbers){
            if(itemNumber>maxNumber){
                maxNumber = itemNumber;
            }
        }
        System.out.println("The maximum number is " + maxNumber);

        //min
        for (int itemNumber:itemNumbers){
            if(itemNumber<minNumber){
                minNumber = itemNumber;
            }
        }
        System.out.println("The minimum number is " + minNumber);

        //ARRAY CLASS AND COMMON METHODS
        //array.toString()
        System.out.println("Array.toString():");
        System.out.println(Arrays.toString(itemNumbers));
        //sorting
        System.out.println("Sorting in ascending order:");
        Arrays.sort(itemNumbers);
        System.out.println(Arrays.toString(itemNumbers));

        //Array binary search method
        Arrays.sort(itemNumbers); //we first sort it out
        System.out.println("BEFORE BINARY SEARCH AFTER SORTING:" + Arrays.toString(itemNumbers));
        int indexSearchLocation = Arrays.binarySearch(itemNumbers,35);
        System.out.println("The location of 6 is at index: " + indexSearchLocation);

        //Copy of array
        int[] itemNumbers1 = {10,200,30,40,55,67,44,64,5,99,100,5,35,21,4,68,90};
        int[] backUp = Arrays.copyOf(itemNumbers1,itemNumbers1.length);
        System.out.println("The new backup: " + Arrays.toString(itemNumbers1));

        // fill an array

        int[] newArray = new int[5];
        int[] newArray1 = new int[5];
        Arrays.fill(newArray,10); //we can add 10 to all indexes
        System.out.println("New Array: " + Arrays.toString(newArray));
        Arrays.fill(newArray1,0,3,10); // we can add 10 from 0 to 3 the rest will have 0s
        Arrays.fill(newArray1,3,5,11); // when we say from 0, we start from 0
        // but we ignore the to index of. hence it is 0,1,2
        //THEREFORE, THE to INDEX IS NOT COUNTED. iF WE SAY to 3, THEN WE end at index 2.
        System.out.println("New array with 0s at the end: " + Arrays.toString(newArray1));
        int[] newArray2 = {10,10,10,11,12};
        // comparing with .equals its a boolean

        System.out.println(Arrays.equals(newArray1,newArray2));




    }
}
