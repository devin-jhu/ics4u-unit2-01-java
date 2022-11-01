/*
 * The stack program
 *
 * By:      Devin Jhu
 * Version: 1.0
 * Since:   2022 10 31
 */

import java.util.Scanner;
/**
* Class Main.
*/

final class Main {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The stack program.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner myObj = new Scanner(System.in);
        // send to MrCoxallStack
        final MrCoxallStack aStack = new MrCoxallStack();

        System.out.println("Enter number: ");
        final int userNumber = myObj.nextInt();
        aStack.push(userNumber);

        aStack.showStack();

        System.out.println("\nDone.");
    }
}
