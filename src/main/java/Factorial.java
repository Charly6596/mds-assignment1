/**
 * Class providing a method that computes the factorial of
 * an integer number
 * @author Carlos Javier Gutiérrez Sánchez
 */
public class Factorial {
    public int compute(int n) {
        if (n < 0) {
            throw new RuntimeException();
        }
        if (n == 0) {
            return 1;
        }
        return n * compute(n - 1);
    }
}
