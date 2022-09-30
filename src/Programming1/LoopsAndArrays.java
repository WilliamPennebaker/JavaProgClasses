package Programming1;

/**
 * 
 * 
 * Author: William Pennebaker - https://github.com/WilliamPennebaker
 */
public class LoopsAndArrays {
    public static void main(String[] args) {
        /**
         * Declaring and defining arrays.
         * These are arrays, notice the structure here. The same as defining an int or String but we add [].
         * Since we are creating an array we have to treat it as such. An array is nothing more than a set of items.
         * For ints we list ints as a set of numbers, ie {1, 2, 3, 4, 5}.
         * For Strings we list them as a set of Strings, ie {"Hello", "World"}.
         */
        int nums[] = {1, 2, 3, 4, 5};
        String[] names = {"William", "Chelsea", "Dailen", "Hayron", "Mark"};

        /**
         * Printing arrays are a bit different from printing regular variables.
         * Since arrays are sets, we have to loop through them to get the values.
         * To get the values of an array we write the array name with [i]. The i will get the index or position in the array and give the value.
         * Arrays start at 0 in Java. 0 being the first index of the array.
         * So [1, 2, 3, 4, 5] is our array.
         *    [0, 1, 2, 3, 4] are the indexes or positions of our numbers in the array.
         * If we write System.out.println(nums[2]); we will print the number 3 since 3 is in the 2nd index of the array.
         * 
         * We need a counter to loop through the array. We can use an int called i and start at the first position.
         * Then we want to loop through the array until the end, so i < nums.length; in our example, nums.length = 5. - Amount of items in the array.
         * Then we need to increment (add one in this example) our i. We do this by writting i++ which will add 1 to i after an iteration of the loop.
         */
        System.out.println("Printing nums with for i loop.");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        /**
         * This is called an "enhanced for loop".
         * Notice the difference in structure.
         * We create an int called num (could use i here too)
         * Then we loop through the array.
         * Think of this as for every num in our nums array we want to print that num.
         */
        System.out.println("Printing nums with foreach loop.");
        for (int num : nums) {
            System.out.println(num);
        }

        /**
         * Regular and enhanced for loop but printing Strings from the string array.
         */
        System.out.println("Printing names with for i loop.");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("Printing names with foreach loop.");
        for (String name : names) {
            System.out.println(name);
        }

        /**
         * Since we touched on having single line if statements without brackets, for loops can do that too.
         * Same can be done for the String array.
         */
        System.out.println("Printing nums with for i loop.");
        for (int i = 0; i < names.length; i++) 
            System.out.println(nums[i]);
    }
}
