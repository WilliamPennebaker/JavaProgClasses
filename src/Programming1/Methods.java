package Programming1;

/**
 * Second class! You are on your way to becoming a real coder!
 * Now we want to talk about methods.
 * Methods are super useful because we can break apart code to handle problems peice by peice
 * 
 * Author: William Pennebaker - https://github.com/WilliamPennebaker
 */
public class Methods {
    /**
     * Our main is of course a method itself, it is the first method that is called when running the program.
     * We have two different types of methods:
     * Private - Means we can only access in the SAME class. So we can't call this from our FirstClass.java file.
     * Public - Means that we can access from anywhere. We could call this from our FirstClass.java file.
     */
    public static void main(String[] args) {
        /**
         * Calling methods is as simple as just writing the method "name" with parantheses after it.
         * We have parantheses there because we can actually pass variables to these methods to do something.
         */
        testPrivate();
        testPublic();

        /**
         * Lets make things more interesting. We are going to pass a String called word to our "newString" method.
         * 
         * When creating the method we added a "Parameter" into our parantheses, meaning that we must pass the same
         * data type in the parantheses when calling the method.
         */
        String word = "York";
        /**
         * When calling the method, we are passing our Sting word as an "Arguement" to the newString method.
         * 
         * Basically we are replacing the "String origString" with whatever is in our String word. In this case
         * we have "York" in our word.
         */ 
        newString(word);

        /**
         * Now that we called that...nothing happened. Thats because we are just running the method but not actually doing
         * anything here in main or in the method that can be printed.
         * 
         * We could have a println in the newString method.
         * 
         * OR
         * 
         * We can do two things here:
         * Save that return value from the newString method into a new variable.
         * Print the newString method in a println statement. (This will just print the return value btw).
         */

        //Saving the return value and printing
        String newWord = newString(word);
        System.out.println(newWord);

        //Printing the newString method return value
        System.out.println(newString(word));

        /**
         * So, if you were to run this you would see both the private and public test methods print out and see the results of  
         * calling the newString method two different ways.
         */

    }

    /**
     * This is a private method.
     * Private methods can only be called in the same class.
     * Static is used here because our main method is static. Other classes may or may not use static.
     */
    private static void testPrivate() {
        System.out.println("This is a private method!");
    }

    /**
     * This is a public method.
     * Public methods can be called in any class.
     */
    public static void testPublic() {
        System.out.println("This is a public method!");
    }

    /**
     * The newString method here is public and instead of being void, is now String!
     * This means we will have to return a variable of that same data type, "String".
     * 
     * We also have a variable in the parantheses, this brings in two words.
     * Arguement and Parameter.
     * 
     * A Parameter is a variable that is defined in the parantheses of the method we create.
     * 
     * An Arguement is a variable passed in the parantheses when calling the method. This will replace the value of our "parameter"
     * with the "Arguement" that we passed when calling the method.
     * 
     */
    public static String newString(String origString) {
        //Creating a newString variable with the value of "New " <- with a space at the end for nice formatting.
        String newString = "New ";
        /**
         * Here we want to add our "origString" (York) to our "newString" (New ).
         * We can actually go about this in different ways.
         */

        //First way to concatenate two variables.
        newString = newString + origString;

        //Second way to concatenate two variables.
        //newString += origString;

        //Thrid way, a little more advanced in it's own way.
        //String newString = "New " + origString //Doing this means we don't need to create the newString variable in the beginning.

        //Lastly, we could combine "New " and the origString in the return statement.
        //return "New " + origString; //Makes for a one line method!

        /**
         * This is a return statement.
         * We need this when we aren't using "void" when creating methods.
         * This will return the String "newString" back to the place where it was called.
         */
        return newString;
    }
}
