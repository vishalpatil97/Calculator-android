package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int DIVISION = 4;

    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        switch (operation){
            case 1: Add add = new Add();
                    mOut.print(add.operation(argumentOne,argumentTwo));  // Addition
                    break;
            case 2: Subtract sub = new Subtract();
                mOut.print(sub.operation(argumentOne,argumentTwo));    // Subtraction
                break;
            case 3: Multiply mul = new Multiply();
                    mOut.print(mul.operation(argumentOne,argumentTwo)); // Multiplication
                    break;
            case 4: Divide div = new Divide();
                    mOut.print(div.operation(argumentOne,argumentTwo));  // Division
        }

    }
}
