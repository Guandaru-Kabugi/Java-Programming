public class RearrangingArrayChallenge {
    public static void main(String[] args){
        // working the rearranging of array challenge
        int[] nums = {2, 5, 1, 3, 4, 7};
        //we want it to look like {235417}
        // we first divide by half
        int n = nums.length/2;
        //we create a new rearranged array with still have the same number of items as nums
        int[] rearranged = new int[nums.length];

        // we write the logic now

        for (int i = 0; i < n; i++) {
            rearranged[2*i] = nums[i];
            rearranged[2*i+1] = nums[i+n];
        }

        System.out.println("Here is the re-arranged array");
        for (int num:rearranged){
            System.out.print(num);

        }
    }
}
