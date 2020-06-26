package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add implements Operation {


    @Override
    public String operation(int num1, int num2) {      // Addition
        return String.valueOf(num1 + num2);   // Returning addition of numbers
    }

}
