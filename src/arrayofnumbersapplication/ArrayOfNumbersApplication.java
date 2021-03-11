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
            
            

            //TESTING THE RESET AND WRITE TO ARRAY
            //specifying the size of the array in the object
            //ArrayOfNumbers a = new ArrayOfNumbers(3);
            //int[] testArray = new int[3];
            
            //adding values to the array
            //testArray[0] = 1;
            //testArray[1] = 2;
            //testArray[2] = 3;
            
            //adding the input values to the object array and saving them in an array to display to the user
            //int[] displayArray = a.ArrayOfNumbers(testArray);
            //System.out.println(Arrays.toString(displayArray));
            
            
            Scanner input = new Scanner(System.in);
            
            
            
            //create two arrays
            ArrayOfNumbers arrA = new ArrayOfNumbers(0);
            
            
            //fill the array
            System.out.println("\nNumber of values in array: ");
            int arrSize = input.nextInt();
            input.nextLine();
            arrA = new ArrayOfNumbers(arrSize);
            int[] tempArray = new int[arrSize];
            for(int i = 0; i < arrSize; i++)
            {
            System.out.println("\nEnter the array values: ");  
            tempArray[i] = input.nextInt();
            input.nextLine();
            }
            int[] intArray = arrA.ArrayOfNumbers(tempArray);
            System.out.println("\nThe array values are: ");
            for(int j = 0; j < arrSize; j++)
            {
                System.out.println((j) + " - " + intArray[j]);
            } 
            
      
            
            //show menu
            System.out.println("\nMenu options:"
                + "\n1: Get a number from array"
                + "\n2: Change a number in array"
                + "\n3: Find highest number in array"
                + "\n4: Check if values are equal"
                + "\n5: Find GCD of numbers in array");
            
            
            //get user choice
            int usrChoice = 0;
            while(usrChoice >= 0 && usrChoice <= 6)
            {
                System.out.println("\nPlease choose an action: ");
                if(input.hasNextInt())
                {
                    usrChoice = input.nextInt();
                }
                else 
                {
                    usrChoice = -1;
                }
                
                //processing all user choices
                switch(usrChoice)
                {
                    //get a number from array
                    case 1:
                        System.out.println("\nPosition of value in array: ");  
                        int position = input.nextInt();
                        int arrPosition = arrA.item(position);
                        input.nextLine();
                        System.out.println("\nThe value at that position is: " + arrPosition);
                    break;
                    
                    
                    //change a number in array
                    case 2:
                        System.out.println("\nPosition of value in array: ");
                        int a = input.nextInt();
                        System.out.println("\nNew value: ");
                        int b = input.nextInt();
                        arrA.setItem(a, b);
                    break;
                    
                    
                    //find highest number in array
                    case 3:
                        System.out.println("\nThe highest number in the array is: ");
                        int highNo = arrA.max();
                        System.out.println(highNo);
                    break;
                    
                    
                    //check if values are equal
                    case 4:
                        System.out.println("\nPosition of first value in array: ");
                        int intA = input.nextInt();
                        System.out.println("\nPosition of second value in array: ");
                        int intB = input.nextInt();
                        boolean equal = arrA.equal(intA, intB);
                        if (equal == true)
                        {
                           System.out.println("\nNumbers are equal."); 
                        }
                        else
                        {
                           System.out.println("\nNumbers are not equal.");  
                        }
                    break;
                    
                    
                    //find GCD of numbers in array
                    case 5:
                        System.out.println("\nPosition of first value in array: ");
                        int intC = input.nextInt();
                        System.out.println("\nPosition of second value in array: ");
                        int intD = input.nextInt();
                        int gcdResult = arrA.gcd(intC, intD);
                        System.out.println("\nThe GCD is: " + gcdResult); 
                    break;
                }
            }
    }
        
}
