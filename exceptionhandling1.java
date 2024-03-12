public class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            validateNumber(5); 
            validateNumber(-2); 
        } catch (CustomValidationException e) {
            System.out.println("Custom Validation Exception caught: " + e.getMessage());
        }
    }

    public static void validateNumber(int number) throws CustomValidationException {
        if (number < 0) {
            throw new CustomValidationException("Number cannot be negative: " + number);
        }
        System.out.println("Number is valid: " + number);
    }
}