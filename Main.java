public class Main {
    public static void main(String[] args) {
        numDivZero(5);
    }
    public static void numDivZero (int num) {
        try {
            var i = num / 0;
        } catch (Exception e) {
            throw new ArithmeticException();
        }
    }
}
