package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract implements Operation{
    @Override
    public String operation(int num1, int num2) {   // Subtraction
        return String.valueOf(num1 - num2);    // Subtraction of numbers
    }

}
