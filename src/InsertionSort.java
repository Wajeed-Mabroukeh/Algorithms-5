public class InsertionSort {

    public void Insertion(int array [])
    {
        int key , j , h ;
        for (int i = 1 ; i < array.length ; i++)
        {
            key = array[i];
            j = i - 1;
            h = i ;
            while( j >= 0 && key < array[j])
            {
                array [h] = array [j];
                array [j] = key;
                j--;
                h--;
            }
        }
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
