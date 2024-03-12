public class DivisionProgram {
    public static void main(String[] args) {
        try {
            divideNumbers(10, 2); 
            divideNumbers(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void divideNumbers(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        int result = numerator / denominator;
        System.out.println("Result of division: " + result);
    }
}