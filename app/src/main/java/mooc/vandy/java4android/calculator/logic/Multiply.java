package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply implements Operation{
    @Override
    public String operation(int num1, int num2) {  // multiplication
        return String.valueOf(num1 * num2);      // Multiplication of numbers
    }

}
