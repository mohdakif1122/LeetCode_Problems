class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int[] diff = new int[n - 1];
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 1 ; i < n ; i++){
            diff[i - 1] = Math.abs(arr[i] - arr[i - 1]);
        }
        int minimum = Integer.MAX_VALUE;

        for(int i = 0 ; i < diff.length ; i++){
            minimum = Math.min(minimum , diff[i]);
        }

        for(int i = 1 ; i < n ; i++){
            int curr = Math.abs(arr[i] - arr[i - 1]);
            if(curr <= minimum){
                res.add(Arrays.asList(arr[i - 1],arr[i]));
            }
        }
        return res;
    }
}