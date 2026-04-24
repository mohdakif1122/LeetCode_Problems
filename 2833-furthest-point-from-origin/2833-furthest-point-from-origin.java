class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l = 0;
        int r = 0;
        int b = 0;

        char[] ch = moves.toCharArray();

        for(char c : ch){
            if(c == 'L'){
                l++;
            }
            else if(c == 'R'){
                r++;
            }
            else{
                b++;
            }
        }
        return Math.abs(l - r) + b;
    }
}