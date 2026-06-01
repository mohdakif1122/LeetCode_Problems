class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int minimum = Integer.MAX_VALUE;

        for(int i = 0 ; i < n - 1 ;i++){
            minimum = Math.min(minimum , Math.abs(arr[i] - arr[i + 1]));
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0 ; i < n - 1 ; i++){
            if(Math.abs(arr[i] - arr[i + 1]) == minimum){
                res.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return res;
    }
}