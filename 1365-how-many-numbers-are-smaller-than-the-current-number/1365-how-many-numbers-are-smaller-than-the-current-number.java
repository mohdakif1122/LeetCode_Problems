class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        int count = 0;

        for(int i = 0 ; i < nums.length ; i++){
            for(int num : nums){
                if(nums[i] > num) count++;
            }
            res[i] = count;
            count = 0;
        }
        return res;
    }
}