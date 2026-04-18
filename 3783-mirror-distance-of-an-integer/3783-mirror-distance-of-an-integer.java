class Solution {
    public int mirrorDistance(int n) {
        int reverse = reverse(n);
        int sum = Math.abs(n - reverse);

        return sum;
    }
    private int reverse(int x){
        int rev = 0;
        int rem = 0;

        while(x > 0){
            rem = x % 10;
            rev = rev * 10 + rem;
            x /= 10;
        }
        return rev;
    }
}