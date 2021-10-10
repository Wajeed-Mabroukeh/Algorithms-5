import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size your Array");
        int sizeofarray = scan.nextInt();
        int[] beginM = new int[sizeofarray],
                beginI = new int[sizeofarray],
                beginQ = new int[sizeofarray],
                beginR = new int[sizeofarray],
                beginR2 = new int[sizeofarray],
                     beginB = new int[sizeofarray];

        ///All Object to Sort Any array
        MergeSort object = new MergeSort();
        InsertionSort object2 =  new InsertionSort();
        QuickSort object3 =  new QuickSort();
        RadixSort object4 =  new RadixSort();
        RadixSort2 object5 =  new RadixSort2();
        BucketSort object6 =  new BucketSort();


        for (int i = 0; i < sizeofarray; i++)
            {
            System.out.println("Enter number " + (i + 1));
                beginM[i] = scan.nextInt();
                beginI[i] =  beginM[i];
                beginQ[i] = beginM[i];
                beginR[i] = beginM[i];
                beginR2[i] = beginM[i];
                beginB[i] = beginM[i];
        }

        //Sorting by Merge
        System.out.println("Array Original before Editing by Merge ");
        object.PrintArray( beginM );
        object.MergeSort(beginM, 0, sizeofarray - 1);
        System.out.println("Array Original After Editing by Merge ");
        object.PrintArray( beginM );

        //Sorting by Insertion
        System.out.println("Array Original before Editing by Insertion ");
        object2.PrintArray( beginI );
        object2.Insertion(beginI);
        System.out.println("Array Original After Editing by Insertion ");
        object2.PrintArray(beginI);

        //Sorting by QuickSort
        System.out.println("Array Original before Editing by QuickSort");
        object3.PrintArray(beginQ);
        object3.QuickSort(beginQ ,0 , sizeofarray - 1);
        System.out.println("Array Original After Editing by QuickSort ");
        object3.PrintArray(beginQ);

        //Sorting by RadixSort1
        System.out.println("Array Original before Editing by RadixSort1");
        object4.PrintArray( beginR );
        object4.RadixSorting(beginR);
        System.out.println("Array Original After Editing  by RadixSort1");
        object4.PrintArray( beginR );

        //Sorting by RadixSort2
        System.out.println("Array Original before Editing RadixSort2");
        object5.PrintArray( beginR2 );
        beginR2 = object5.Sort(beginR2);
        System.out.println("Array Original After Editing RadixSort2");
        object5.PrintArray( beginR2 );

        //Sorting by BucketSort
        System.out.println("Array Original before Editing BucketSort");
        object6.PrintArray( beginB );
        beginB = object6.bucketSort(beginB);
        System.out.println("Array Original After Editing BucketSort");
        object6.PrintArray( beginB );

    }

    //Write Code By Eng.Wajeed -_-
}
