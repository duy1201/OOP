public class Numeral extends Expression {
    private double value;

    public Numeral(double value) {
        this.value = value;
    }

    public Numeral() {
        value = 0;
    }

    @Override
    public String toString() {
        if (value == (int) value) {
            return Integer.toString((int) value);
        } else {
            return Double.toString(value);
        }
    }

    @Override
    public double evaluate() {
        return value;
    }
}
