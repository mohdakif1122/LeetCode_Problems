class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res = new HashSet<>();
        Set<Integer> set = new HashSet<>();

        for(int num : nums2){
            set.add(num);
        }
        for(int i = 0 ; i < nums1.length ; i++){
            if(set.contains(nums1[i])){
                res.add(nums1[i]);
            }
        }
        int[] result = new int[res.size()];
        int index = 0;
        for(int num : res){
            result[index] = num;
            index++;
        }
        return result;

    }
}