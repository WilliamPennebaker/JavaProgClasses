package Programming1;

/**
 * 
 * 
 * Author: William Pennebaker - https://github.com/WilliamPennebaker
 */
public class IfStatements {
    public static void main(String[] args) {
        /**
         * 
         */
        int num = 10;
        
        /**
         * 
         */
        if(num == 10) {
            System.out.println("The number 10.");
        }
        
        /**
         * 
         */
        if(num == 11) {
            System.out.println("The number 11.");
        } else {
            System.out.println("The number 10.");
        }
        
        /**
         * 
         */
        if(num == 11) {
            System.out.println("The number 11.");
        } else if(num == 10) {
            System.out.println("The number 10.");
        } else {
            System.out.println("Option not handled in this if statement.");
        }

        /**
         * 
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
