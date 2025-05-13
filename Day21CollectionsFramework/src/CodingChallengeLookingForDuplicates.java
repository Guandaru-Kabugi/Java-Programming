import java.util.Scanner;

public class CodingChallengeLookingForDuplicates {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of the array you want.");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            System.out.println("Element at index " + i);
            nums[i] = scanner.nextInt();

        } //get user input

        System.out.println("Enter the value of k: ");
        int k = scanner.nextInt();

        boolean result = CheckDuplicates.containsNearbyDuplicates(nums,k);
        System.out.println("Output: " + result);
        scanner.close();


    }
}

