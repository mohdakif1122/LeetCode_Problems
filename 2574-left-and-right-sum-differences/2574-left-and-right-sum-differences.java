class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        int Lsum = 0;
        int Rsum = 0;

        leftSum[0] = 0;
        rightSum[n - 1] = 0;

        for(int i = 0 ; i < n - 1 ; i++){
            Lsum += nums[i];
            leftSum[i + 1] = Lsum;
        }

        for(int i = n - 1 ; i > 0 ; i--){
            Rsum += nums[i];
            rightSum[i - 1] = Rsum;
        }
        int[] answer = new int[n];
        for(int i = 0 ; i < n ; i++){
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return answer;
    }
}