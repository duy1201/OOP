public class Solution {
    /**
     * This is gcd.
     * @param a a
     * @param b b
     * @return b
     */
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        int res = gcd(b, a % b);
        if (res < 0) {
            res = -res;
        }
        return res;
    }
} 
