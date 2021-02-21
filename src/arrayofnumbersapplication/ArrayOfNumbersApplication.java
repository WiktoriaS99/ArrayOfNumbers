/*
 * Code that allows the user to insert values into an array and allow them to be manipulated based on option menu
 */
package arrayofnumbersapplication;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wikto
 */
public class ArrayOfNumbersApplication {
    
        public static void main(String[] args) {
            
            //Scanner input = new Scanner(System.in);

            //TESTING THE RESET AND WRITE TO ARRAY
            //specifying the size of the array in the object
            ArrayOfNumbers a = new ArrayOfNumbers(3);
            int[] testArray = new int[3];
            
            //adding values to the array
            testArray[0] = 1;
            testArray[1] = 2;
            testArray[2] = 3;
            
            //adding the input values to the object array and saving them in an array to display to the user
            int[] displayArray = a.ArrayOfNumbers(testArray);
            System.out.println(Arrays.toString(displayArray));
    }
        
}
