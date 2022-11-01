/*
* The MrCoxallStack.
*
* @author  Devin Jhu
* @version 1.0
* @since   2022-10-31
*/

import java.util.ArrayList;
/**
*  Make class MrCoxallStack.
*/

public class MrCoxallStack {

    /**
    * An ArrayList that will hold the tack elements.
    */
    private ArrayList<Integer> theStack = new ArrayList<Integer>();

    /**
    * Getter.
    * The showStack method.
    */
    public void showStack() {
        // print out the ShowStack
        System.out.println("\nThe stack list.");
        for (Integer aSingleElement : theStack) {
            System.out.println(aSingleElement);
        }
        System.out.println("End of stack list.\n");
    }

    /**
    * The push() function.
    *
    * @param pushNumber The int to be added to the stack
    */
    public void push(final int pushNumber) {
        theStack.add(0, pushNumber);
    }

}
