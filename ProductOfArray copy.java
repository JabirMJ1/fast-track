class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int[] leftPass = new int[nums.length];
        int tot = 1;
        leftPass[0] = 1;
        answer[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            tot = tot*nums[nums.length-i];
            leftPass[i] = tot;
        }

         tot = 1;
        for (int i = 1; i < nums.length; i++) {
            tot = tot*nums[i-1];
            answer[i] = tot;
        }

        for (int i = 0; i < nums.length; i++) {
            answer[i]= leftPass[nums.length - i - 1] * answer[i];
        }

        return answer;
    }
}