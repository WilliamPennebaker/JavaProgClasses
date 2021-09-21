/**
 * Welcome to Java Programming 1! Here you will learn the basics of coding the programming language Java.
 * I will try to have comments on everything that needs them and explain the concepts in plain words.
 * Nothing is more annoying than trying to learn something in words you can't even understand.
 * With that said lets begin!
 * 
 * Author: William Pennebaker - https://github.com/WilliamPennebaker
 */
public class FirstClass {

    /**
     * This is the main, it will be the first thing that runs when pressing play in your editor or running the java file.
     * Starting out for the first time, all your code will go between the two brackets { }.
     */
    public static void main(String[] args) {

        /**
         * Argueably the first thing taught in a programming language.
         * System.out.println(...); Will take whatever is in parentheses and prints it to the console.
         * Oh, make sure to include the little ' ; ' (semi-colon) after every line. Java is very picky and doesn't know when a 
         * line ends without that.
         */
        System.out.println("Hello, World!");

        /**
         * Primative Types
         * These are called variables, the primative "data types" that java comes with.
         * Using these we can store information in them and reference them later.
         * They all have their own storage limitations.
         */
        int num = 10;        //Integer (whole number from -128 to 127)
        byte byteNum = 100;       //Integer (whole number from -32,768 to 32,767)
        short shortNum = 5000;     //Integer (whole number from -2,147,483,648 to 2,147,483,647)
        long longNum = 1500000000l;       //Integer (whole number from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        float floatNum = 5.75555f;      //Integer (fractional number, 6 to 7 decimal digits)
        double decimal = 19.25d;     //Integer (fractional number, 15 decimal digits)
        boolean flag = true;       //True or False. Also used as a "flag"
        char character = 'w';     //Character (one letter)

        /**
         * We can print these all out to the console.
         * Printing variables with a sentence requires concatenation.
         * For this we simply write "Something in parentheses" + dataType.
         */
        System.out.println("Our integer: " + num);
        System.out.println("Our byte: " + byteNum);
        System.out.println("Our short: " + shortNum);
        System.out.println("Our long: " + longNum);
        System.out.println("Our float: " + floatNum);
        System.out.println("Our decimal: " + decimal);
        System.out.println("Our flag: " + flag);
        System.out.println("Our char: " + character);

        /**
         * Non Primative Types
         * Java also has non primative types.
         * These include: Strings, Arrays, Classes, Interfaces, etc.
         * I will list strings below. I will go over arrays in another class considering loops are needed.
         * Other files may include classes, interfaces, etc.
         */

        //Strings are made up of multiple chars!
        String word = "Word"; // So this would be char w = 'w', char o = 'o', and so on.

        //This is what our array would look like, if we had one.
        //int myArray[] = {1, 2, 3}

        /**
         * Lets print these out as well.
         */
        System.out.println("Our string: " + word);

    }
}
