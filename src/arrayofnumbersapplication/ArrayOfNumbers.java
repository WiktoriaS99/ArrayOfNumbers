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
   
   public int item(int itemPos)
    {     
        int thisval = this.storageArray[itemPos];
        return thisval;
    }
    
    public void setItem(int a, int b)
    {
        this.storageArray[a] = b;
    }
    
    public int max()
    {
        int max = this.storageArray[0];
        for(int i = 0; i<this.storageArray.length; i++)
        {
            if(this.storageArray[i] > max)
            {
                max = this.storageArray[i];
            }
        }
        return max;
    }
    
      public int item(int itemPos)
    {     
        int thisval = this.storageArray[itemPos];
        return thisval;
    }
    
    public void setItem(int a, int b)
    {
        this.storageArray[a] = b;
    }
    
    public int max()
    {
        int max = this.storageArray[0];
        for(int i = 0; i<this.storageArray.length; i++)
        {
            if(this.storageArray[i] > max)
            {
                max = this.storageArray[i];
            }
        }
        return max;
    }
    
    public boolean equal(int a, int b)
    {
       return this.storageArray[a] == this.storageArray[b];
    }
    
    public int gcd(int a, int b) 
    {
        while (a != b)
        {
            if (a > b)
            {
                a = a-b;
            }
            else 
            {
                b = b-a;
            }
        }
        return a;
    }
    
    public int count()
    {
        int count = 0;
        for(int a=0; a < this.storageArray.length; a++)
        {
            count++;
        }
        return count;
    }
    
    public int sum()
    {
        int total = 0;
        for(int a=0; a < this.storageArray.length; a++)
        {
            total += this.storageArray[a];
        }
        return total;
    }
        
    public int average()
    {
        int total = 0;
        int average;
        
        for(int a=0; a < this.storageArray.length; a++)
        {
            total += this.storageArray[a];
        }
        average = total/this.storageArray.length;
        return average;
    }
    
    public int[] scalarMultiply(int a)
    {
        for(int b=0; b<this.storageArray.length; b++)
        {
            this.storageArray[b] = this.storageArray[b] * a;
        }
        return this.storageArray;
    }
    
    public int[] addConstant(int a)
    {
        for(int b=0; b<this.storageArray.length; b++)
        {
            this.storageArray[b] = this.storageArray[b] + a;
        }
        return this.storageArray;
    }
}