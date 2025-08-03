public class RecursiveFact {
    static int getFactorial(int n) {
        return n <= 1 ? 1 : n * getFactorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + getFactorial(5));
    }
}
