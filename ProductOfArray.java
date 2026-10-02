class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int total = 1;
        int zeroCount = 0;

        for(int i = 0; i<nums.length; i++) {
            if(nums[i] == 0) {
                zeroCount+=1;
                continue;
            }

            total*=nums[i];
        }

        if(zeroCount > 0) {
            for(int i=0; i<nums.length; i++ ){
                if(zeroCount > 1) {answer[i] = 0;}
                else if(nums[i] == 0) {answer[i]=total;}
                else {answer[i] = 0;}
            }
        }
        else {
            for(int i=0; i<nums.length; i++ ){
                answer[i] = total / nums[i];
            }
        }

        return answer;
    }
}