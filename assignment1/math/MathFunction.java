package math;

public class MathFunction {
    public static int powerRecursive(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * powerRecursive(x, n - 1);
    }

    public static int factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }
}
