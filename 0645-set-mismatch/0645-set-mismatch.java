class Solution {
    public int[] findErrorNums(int[] nums) {
        int sum = 0;
        int n = nums.length;
        Set<Integer> kk = new HashSet<>();
        int[] res = new int[2];

        for(int num : nums){
            if(!kk.contains(num)) {
                kk.add(num);
                sum += num;
            }
            else res[0] =  num;
        }
        res[1] = (n * (n+1) / 2) - sum;

        return res;
    }
}