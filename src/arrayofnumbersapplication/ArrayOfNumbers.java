/*
 * Code that allows the user to insert values into an array and allow them to be manipulated based on option menu
 */
package arrayofnumbersapplication;

/**
 * @author wikto
 */
public class ArrayOfNumbers {

   private int[] storageArray;
   
   public int[] ArrayOfNumbers(int[] inputArray) {

       //checking the size of the input array and setting the size to the storage array
       int arraySize = inputArray.length;
       this.storageArray = new int[arraySize];
       
       //copying values from input array into the storage array
       System.arraycopy(inputArray, 0, this.storageArray, 0, inputArray.length);
       return this.storageArray;
}
   
   public ArrayOfNumbers(int arraySize) {
       
        //setting the size of the storage array
        this.storageArray = new int[arraySize];
        
        //assigning the value of zero to each of the values in storage array
        for(int i = 0; i < arraySize; i++) {
            this.storageArray[i] = 0;
       }
   }
    
}