public class Solution {
    /**
     * This is fibonacci.
     * @param n tham so n
     * @return fibonacci cua n
     */
    public long fibonacci(long n) {
        long f0 = 0;
        long f1 = 1;
        if (n < 0) {
            return -1;
        }
           
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }
            
        long res = 0;
        long i = 2;
        while (i <= n) {
            res = f0 + f1;
            f0 = f1;
            f1 = res;
            i++;
            if (i == 94) {
                return Long.MAX_VALUE;
            }
        }
        return res;
    }
}
   
