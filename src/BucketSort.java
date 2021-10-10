import java.util.*;


public class BucketSort {

    public  Random random = new Random();

    public  double whatIsDivisor(int number)
    {
        int i = 0 ;
        while(true) {
            if((number >= Math.pow(10, i)) && (number < Math.pow(10, i+1))) {
                return Math.pow(10, i+1);
            }
            i++;
        }
    }

    public  int [] bucketSort(int [] arr) {

        int min = BucketSort.minNumber(arr);

        double divisor = 0;

        if(min < 0) {
            BucketSort.addForAllElements(arr, min * -1);
        }

        int max = BucketSort.maxNumber(arr);                //n

        divisor = whatIsDivisor(max);
        //System.out.println("divisor:"+divisor+",max:"+max+",min:"+min);

        double [] arrayBetween0_1 = BucketSort.dividArrayby(arr, divisor);

        Vector<Integer> [] digitVector = (Vector<Integer>[]) new Vector[10];

        for(int i=0; i<10; i++) {
            digitVector[i] = new Vector<Integer>();
        }

        for(int i=0; i<arr.length; i++) {
            int index = (int) (arrayBetween0_1[i]*10);

            digitVector[index].add(arr[i]);
        }
        int [] sortedArray = new int[arr.length];
        int t=0; // index of sorted array
        for(int i=0; i<10; i++) {
            Integer [] arrFromVector = new Integer[digitVector[i].size()];
            arrFromVector = digitVector[i].toArray(arrFromVector);
           quickSort(arrFromVector, 0, arrFromVector.length - 1);

            for(int j=0; j< arrFromVector.length; j++) {
               // System.out.println(""+arrFromVector[j]);
                sortedArray[t++] = (int) (arrFromVector[j]);
            }
           // System.out.println("-----");
        }

        if(min < 0) {
            BucketSort.addForAllElements(sortedArray, min);
        }
        return sortedArray;
    }

    public static double [] dividArrayby(int [] arr, double divisor) {

        double []dividedArray = new double[arr.length];
        for(int i=0; i<arr.length; i++) {
            dividedArray[i] = arr[i] / divisor;
        }
        return dividedArray;
    }

    public static int maxNumber(int [] arr) {
        int max = arr[0];
        for(int i=1; i< arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max ;
    }

    public static int minNumber(int []arr){
        int min = arr[0];
        for(int i=1; i< arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min ;
    }

    public  void quickSort(Integer []arr, int firstIndex,int finalIndex){

        if((firstIndex-1 == finalIndex) || (firstIndex == finalIndex)) {
            return;
        }

        int pivotIndex = random.nextInt((finalIndex - firstIndex));//firstIndex;
        pivotIndex += firstIndex;

        BucketSort.swap(arr, firstIndex, pivotIndex); //firstly make a swap, then the pivot will be in the first position

        Integer pivot = arr[firstIndex];

        int j = firstIndex + 1;
        int i = firstIndex;
        for(int l=0 ; l<(finalIndex - firstIndex); l++) {

            if(pivot>arr[j]) {
                i++;
                BucketSort.swap(arr, i, j);
            }
            j++;
        }
        BucketSort.swap(arr, i, firstIndex);

       quickSort(arr,i+1,finalIndex);

       quickSort(arr,firstIndex,i-1);


    }
    public static void addForAllElements(int [] arr, int number) {
        for(int i=0; i<arr.length; i++) {
            arr[i] += number;
        }
    }

    public static void swap(Integer [] arr, int i, int j){

        Integer temp = 0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
