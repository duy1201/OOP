public class Division extends BinaryExpression {

    public Division(Expression left, Expression right) {
        super(left, right);
    }

    public static double divide(double a, double b) throws ArithmeticException {
        return a / b;
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " / " + right.toString() + ")";
    }

    @Override
    public double evaluate() throws ArithmeticException {
        if (right.evaluate() == 0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        }
        return left.evaluate() / right.evaluate();
    }
}
