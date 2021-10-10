public class MergeSort {

    ///Merge  Array
    public  void Merge(int Array[], int Left, int medium, int right)
    {
        int nub1 = medium - Left + 1;
        int nub2 = right - medium;
        int ii = 0 , j = 0 , k = Left;

        int[] arrayL = new int[nub1];
        int[] arrayR = new int[nub2];

        for (int i = 0; i < nub1; i++)
        {
            arrayL[i] = Array[i + Left];
        }

        for (int i = 0; i < nub2; i++)
        {
            arrayR[i] = Array[i + medium + 1];
        }

        while (ii < nub1 && j < nub2)
        {
            if (arrayL[ii] <= arrayR[j])
            {
                Array[k++] = arrayL[ii++];
            }
            else
            {
                Array[k++] = arrayR[j++];
            }
        }

        while (ii < nub1)
        {
            Array[k++] = arrayL[ii++];
        }

        while (j < nub2)
        {
            Array[k++] = arrayR[j++];
        }

    }

    public  void MergeSort(int Array[], int Left, int right)
    {
        if (Left >= right) return;
        int medium = Left + (right - Left) / 2;
        MergeSort(Array, Left, medium);
        MergeSort(Array, medium + 1, right);
        Merge(Array, Left, medium, right);
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
