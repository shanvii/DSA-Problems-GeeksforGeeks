class Solution {
    public static int trailingZeroes(int n) {
        // code here
        int count = 0;
        while(n > 0) {
            n = n/5;
            count += n;
        }
        return count;
    }
}