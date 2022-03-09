/**
 * Class providing a method that computes the factorial of
 * an integer number
 * @author Carlos Javier Gutiérrez Sánchez
 */
public class Factorial {
    public int compute(int n) {
        int result = 1;
        if (n < 0) {
            throw new RuntimeException();
        }

        while(n > 1){
            result *= n;
            n--;
        }

        return result;
    }
}
