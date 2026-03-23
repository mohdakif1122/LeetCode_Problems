class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int k = 0;

        for (int num : nums) {
            if (num != val) {
                nums[k] = num;
                k++;
            }
        }
        return k;
        
    }
}