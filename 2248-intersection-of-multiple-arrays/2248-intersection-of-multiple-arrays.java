class Solution {
    public List<Integer> intersection(int[][] nums) {
        int n = nums.length;
        int[] count = new int[1001];

        for(int[] num : nums){
            for(int nu : num){
                count[nu]++;
            }
        }
        System.out.print(Arrays.toString(count));
        List<Integer> res = new ArrayList<>();
        // int[] demo = new int[2];

        for(int i = 1 ; i < count.length ; i++){
            if(count[i] == n)
                res.add(i);
        }
        return res;
    }
}