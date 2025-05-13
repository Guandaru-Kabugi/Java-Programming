import java.util.HashSet;

public class CheckDuplicates {

    public static boolean containsNearbyDuplicates(int[] nums, int k){
        HashSet<Integer> set = new HashSet<>();

        //we loop and see if the set has any unique values similar to what is in the array
        //if not, we add it

        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);

            //we want the length to remain at k
            if(set.size()>k){
                set.remove(nums[i-k]);
            }

        }
        return false;
    }

}
