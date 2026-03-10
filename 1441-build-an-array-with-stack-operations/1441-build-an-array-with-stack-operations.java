class Solution {
    public List<String> buildArray(int[] target, int n) {
        
        List<String> res = new ArrayList<>();
        int index = 0;

        for(int i = 1; i <= n; i++){
            res.add("Push");

            if(i == target[index]){
                index++;
                if(index == target.length){
                    break;
                }
            }
            else res.add("Pop");
        }
        return res;
    }
}