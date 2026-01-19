import java.util.Arrays;
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % nums.length;

        // for(int i = 0 ; i <= k ; i++){
        //     int first = nums[0];
        //     for(int j = 0 ; j < n -1 ; j++ ){
        //         nums[j] = nums[j + 1];
        //     }
        //     nums[n - 1] = first;
        // }

        // for (int i = 0; i < k; i++) {
        //     int last = nums[n - 1];

        //     for (int j = 0; j < n - 1; j++) {
        //         nums[n - j - 1] = nums[n - j - 2];
        //     }

        //     nums[0] = last;
        // }

        int[] arr = new int[n];
        int idx = 0;

        for (int i = n - k; i < n; i++) {
            arr[idx++] = nums[i];
        }

        for (int i = 0; i < n - k; i++) {
            arr[idx++] = nums[i];
        }

        for (int i = 0; i < n; i++) nums[i] = arr[i];
    }
}