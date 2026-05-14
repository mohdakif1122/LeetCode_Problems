class Solution {
    public List<Integer> intersection(int[][] nums) {
        int n = nums.length;
        int[] count = new int[1001];

        for(int[] num : nums){
            for(int nu : num){
                count[nu]++;
            }
        }
        List<Integer> res = new ArrayList<>();
        
        for(int i = 1 ; i < count.length ; i++){
            if(count[i] == n) res.add(i);
        }
        return res;
    }
}