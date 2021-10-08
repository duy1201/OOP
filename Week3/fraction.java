public class Solution {

    private int numerator;
    private int denominator;

    Solution() {
        denominator = 1;
    }

    Solution(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            denominator = 1;
        }
           
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    /**
     * this is set.
     * @param denominator mau so
     */
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            denominator = 1;
        }
        this.denominator = denominator;
    }

    public int getDenominator() {
        return denominator;
    }

    /**
     * this is gcd.
     * @param a a
     * @param b b
     * @return gcd(a,b)
     */
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    /**
     * this is reduced.
     * @return rut gon
     */
    public Solution reduce() {
        int ucln = gcd(numerator, denominator);
        numerator /= ucln;
        denominator /= ucln;
        return this;
    }

    /**
     * this is add.
     * @param newSol newSol
     * @return add 
     */
    public Solution add(Solution newSol) {
        int num = numerator * newSol.getDenominator() + denominator * newSol.getNumerator();
        int den = denominator * newSol.getDenominator();
        numerator = num;
        denominator = den;
        return this.reduce();
    }

    /**
     * this is tru.
     * @param newSol newSol
     * @return tru
     */
    public Solution subtract(Solution newSol) {
        int num = numerator * newSol.getDenominator() - denominator * newSol.getNumerator();
        int den = denominator * newSol.getDenominator();
        numerator = num;
        denominator = den;
        return this.reduce();
    }

    /**
     * this is bala.
     * @param obj obj
     * @return bla bla
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            if (numerator * other.getDenominator() - denominator * other.getNumerator() == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * this is nhan.
     * @param newSol newSol
     * @return nhan
     */
    public Solution multiply(Solution newSol) {
        int num = numerator * newSol.getNumerator();
        int den = denominator * newSol.getDenominator();
        numerator = num;
        denominator = den;
        return this.reduce();
    }

    /**
     * this is chia.
     * @param newSol newSol
     * @return chia
     */
    public Solution divide(Solution newSol) {
        int num = numerator * newSol.getDenominator();
        int den = denominator * newSol.getNumerator();
        numerator = num;
        denominator = den;
        return this.reduce();
    }

    public void print() {
        System.out.println(numerator + " " + denominator);
    }
}  
