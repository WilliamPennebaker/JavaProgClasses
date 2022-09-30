package Programming1;

/**
 * 
 * 
 * Author: William Pennebaker - https://github.com/WilliamPennebaker
 */
public class IfStatements {
    public static void main(String[] args) {
        /**
         * Defining and declaring our num variable to 10.
         */
        int num = 10;
        
        /**
         * The first if statement. If our num variable is equal to (==) 10 then we print "The number 10."
         */
        if(num == 10) {
            System.out.println("The number 10.");
        }
        
        /**
         * If else statement. If num is equal to 10 then we print "The number 10". If num is anything "else" then we print that num.
         */
        if(num == 10) {
            System.out.println("The number 11.");
        } else {
            System.out.println("The number " + num + ".");
        }
        
        /**
         * If else chain statement.
         * If num equals 10, print "The number 10."
         * Else if num equals 11, print "The number 11."
         * For the else statement we are just printing "Option not handled in this if statement."- This is an example of error handling which will
         * be discussed later.
         */
        if(num == 10) {
            System.out.println("The number 10.");
        } else if(num == 11) {
            System.out.println("The number 11.");
        } else {
            System.out.println("Option not handled in this if statement.");
        }

        /**
         * An if statement with a single println, delaration or call can be written without brackets.
         * This is the same when using a for loop.
         */
        if(num == 10)
            System.out.println("The number 10.");

        /**
         * Switch statements are structured differently.
         * The switch takes in a value (num) and then we add cases for it to switch between depending on the value taken.
         * Since we passed num in the switch case, if our num is 10 then we print "The number 10."
         */
        switch (num) {
            case 10:
                System.out.println("The number 10.");
                break;
            case 11:
                System.out.println("The number 11.");
                break;
            default:
                System.out.println("Option not handled in switch case.");
                break;
        }
    }
}
