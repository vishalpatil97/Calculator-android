package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide implements Operation {

    @Override
    public String operation(int num1, int num2) {
        if(num2 == 0){                               // divisor is zero
            return "Divisible by zero - Undefined entity";
        }
        return String.valueOf(num1/num2) + " R: " + String.valueOf(num1%num2); // Returning the quotient with remainder
    }
}
