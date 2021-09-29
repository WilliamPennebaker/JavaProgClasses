package Programming1;

/**
 * 
 * 
 * Author: William Pennebaker - https://github.com/WilliamPennebaker
 */
public class LoopsAndArrays {
    public static void main(String[] args) {
        /**
         * 
         */
        int nums[] = {1, 2, 3, 4, 5};
        String[] names = {"William", "Chelsea", "Dailen", "Hayron", "Dylan"};

        /**
         * 
         */
        System.out.println("Printing nums with for i loop.");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        /**
         * 
         */
        System.out.println("Printing nums with foreach loop.");
        for (int num : nums) {
            System.out.println(num);
        }

        /**
         * 
         */
        System.out.println("Printing names with for i loop.");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("Printing names with foreach loop.");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
