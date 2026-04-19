class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        // first make valid pairs ( condition : i <= j && nums1[i] <= nums2[j])
        //where and how do you store the pairs?
        // track the maximum distance.
        int maxDist = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = i + maxDist; j < nums2.length; j++) {
                if (nums1[i] <= nums2[j]) {
                    maxDist = Math.max(maxDist, j - i);
                } 
                else {
                    break;
                }
            }
        }
        return maxDist;
    
    }
}