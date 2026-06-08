class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        List<Integer> lessThan = new ArrayList<>();
        List<Integer> greaterThan = new ArrayList<>();
        List<Integer> equals = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            if(nums[i] < pivot){
                lessThan.add(nums[i]);
            }
            if(nums[i] > pivot){
                greaterThan.add(nums[i]);
            }
            else if(nums[i] == pivot){
                equals.add(nums[i]);
            }
        }
            
        lessThan.addAll(equals);
        lessThan.addAll(greaterThan);

        return lessThan.stream().mapToInt(Integer::intValue).toArray();
    }
}