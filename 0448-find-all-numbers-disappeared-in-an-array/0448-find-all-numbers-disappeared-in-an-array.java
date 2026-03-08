class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> lk = new HashSet<>();

        int n = nums.length;
        

        for(int i = 1 ; i <= n ; i++){
            lk.add(i); //[1,2,3,4,5,6,7,8]
        }
        for(int num : nums){
            if(lk.contains(num)){       //lk -> 4
                lk.remove(num);     //lk # indexOf(4)
            }
        }
        return new ArrayList<>(lk);
    }
}