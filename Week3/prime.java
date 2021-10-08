public class Solution {
    /**
     * This is isPrime.
     * @param n n
     * @return t or f
     */
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int cnt = 0;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                cnt++;
            }
            if (cnt > 0) {
                break;
            }
        }
        if (cnt == 0) {
            return true;
        }
        return false;
    }
} 
