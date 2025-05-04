import java.util.ArrayList;

public class WorkingWith2DArrays {
    public static void main(String[] args){
        //declaring 2d arrays
        int[][] my2DArray = new int[3][3];
        //assigning values we can do
        //my2DArray[0][0] = 1; or use a for loop
        int value = 0;
        for (int i = 0; i < my2DArray.length; i++) { // this length is for the row
            for (int j = 0; j < my2DArray[i].length; j++) { // this length is for column
                my2DArray[i][j] = value++;


            }

        }
        for (int i = 0; i < my2DArray.length; i++) {
            for (int j = 0; j < my2DArray[i].length; j++) {
                System.out.print(my2DArray[i][j] + " ");
            }
            System.out.println(); // move to next line after each row

        }

        //another way to initialize
        int[][] my2DArray2 = {{4,5,6},{7,2,14},{10,11,12}};

        for (int i = 0; i < my2DArray2.length; i++) {
            for (int j = 0; j < my2DArray2[i].length; j++) {
                System.out.print(my2DArray2[i][j] + " ");
            }
            System.out.println(); // move to next line after each row

        }

        //we can also use enhanced loop
        System.out.println("The enhanced loop.");
        for(int[] rows: my2DArray2){
            for (int num:rows){
                System.out.print(num + " ");

            }
            System.out.println(); // move to next line after each row

        }

        //get the largest number
        System.out.println("Checking largest number.");
        int largest = my2DArray2[0][0];
        for(int[] rows: my2DArray2){
            for (int num:rows){
                if(num>largest){
                    largest = num;
                }


            }


        }
        System.out.println("Largest Number is " + largest);

        //Get the smallest number
        //get the largest number
        System.out.println("Checking largest number.");
        int smallest = my2DArray2[0][0];
        for(int[] rows: my2DArray2){
            for (int num:rows){
                if(num<smallest){
                    smallest = num;
                }


            }


        }
        System.out.println("smallest Number is " + smallest);

        //getting sum of all items
        //manual calculation
        //(n/2)(first number + last number) = sum
        //e.g. for the 2d array2: we have (9*2)(4+12)
        System.out.println("Checking sum.");
        int sum= 0;
        for(int[] rows: my2DArray2){
            for (int num:rows){
                sum+=num;


            }


        }
        System.out.println("Sum is " + sum);

        //WORKING WITH ARRAY LIST
        //Declare and initialize an array
        ArrayList<String> fruits = new ArrayList<String>();
        //assign values
        fruits.add("Banana");
        fruits.add("Dates");
        fruits.add("Pineapple");
        fruits.add("Oranges");
        //printing out
        for (String fruit:fruits){
            System.out.println(fruit);
        }

        //get a single item
        System.out.println();
        System.out.println(fruits.get(1));

        //check if the array list has an item using contains method
        boolean hasFruit = fruits.contains("Oranges");
        System.out.println();
        System.out.println(hasFruit);

        //getting size of an arraylist
        System.out.println();
        System.out.println(fruits.size());

        //removing an item from an arraylist
        System.out.println();
        fruits.remove(0);
        System.out.println(fruits.size());
    }
}
