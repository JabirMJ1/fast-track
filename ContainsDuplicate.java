import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> check = new HashSet<>();
        boolean flag = false;

        for(int i=0; i<nums.length; i++) {
            if(!check.add(nums[i])) {
                flag = true;
                break;
            }
        }

        return flag;
    }
}