public class QuickSort {

    public int Partition( int array[] , int Lift , int right)
    {
        int key = Lift;

        while(true)
        {
            while (array[key] <= array[right] && right != key) {
                right--;
            }
            if (key == right) break;
            else {
                int temp = array[key];
                array[key] = array[right];
                array[right] = temp;
                key = right;
                Lift++;
            }

            while (array[key] >= array[Lift] && Lift != key) {
                Lift++;
            }
            if (key == Lift) break;
            else {
                int temp = array[key];
                array[key] = array[Lift];
                array[Lift] = temp;
                key = Lift;
                right--;
            }

        }

        return key;

    }

    void QuickSort(int array[], int Lift, int right) {

        if (Lift >= right) return;
        int k = Partition(array, Lift, right);
        QuickSort(array, Lift, k - 1);
        QuickSort(array, k + 1, right);

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

