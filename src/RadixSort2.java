//Eng.Wajeed Mabroukeh
import java.io.*;
import java.util.*;

public class RadixSort2 {

    public  int [] Sort(int []array)
        {
            int [] SortedArray = array;
            int MaxNum = MaxNumber(array);

            for(int i = 1 , T = 0 ; (MaxNum/i) > 0 ; i*= 10 , T++)
            {
              SortedArray = countingSort(SortedArray, T);

            }
            return SortedArray;
        }

    public  int [] countingSort(int []arr, int Value) {

        int [] countingArray = new int[10];
        int [] digitsArray = new int[arr.length];
        int [] copyOfArray = arr.clone();
        int digit=0;

        for(int i=0; i< arr.length; i++) {

            copyOfArray[i] /= (Math.pow(10,Value));
            digit = copyOfArray[i]%10;
            digitsArray[i] = digit;
            countingArray[digit]++;

        }
        for(int i=0 ;i<9; i++) {
            countingArray[i+1] = countingArray[i] + countingArray[i+1];
        }
        int [] sortedArr = new int[arr.length];
        for(int i= sortedArr.length -1 ; i >= 0; i--) {
            sortedArr[countingArray[digitsArray[i]] - 1] = arr[i];
            countingArray[digitsArray[i]]--;
        }
        return sortedArr;
    }

    public  int MaxNumber(int [] array)
        {
            int max = array[0];
            for(int i=1; i< array.length; i++)
            {
                if (array[i] > max)
                {
                    max = array[i];
                }
            }
            return max ;
        }
     public   void  PrintArray(int array[])
        {
        StringBuffer start = new StringBuffer("[");
        for (int i = 0; i < array.length; i++)
        {
            if (i != array.length-1)
            {
                start.append(array[i] + ",");
            }
            else
            {
                start.append(array[i]);
            }
        }
        start.append("]");
        System.out.println(start);
    }

}
