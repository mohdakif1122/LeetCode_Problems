class Solution {
    public boolean isGood(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }

        if(nums.length != max + 1) return false;

        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if(nums[i] == max) count++;
        }

        if(count != 2) return false;
        return set.size() == max;
    }
}