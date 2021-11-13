public class ExpressionTest {
    public static void main(String[] args) {
        Numeral a1 = new Numeral(10);
        Square a2 = new Square(a1);
        Subtraction a3 = new Subtraction(a2, new Numeral(3));
        //Multiplication a4 = new Multiplication(new Numeral(4), new Numeral(3));
        Division a4 = new Division(new Numeral(4), new Numeral(0));
        Addition a5 = new Addition(a3, a4);
        Square a6 = new Square(a5);
        System.out.println(a6.toString());
        System.out.println(a6.evaluate());
    }
}
