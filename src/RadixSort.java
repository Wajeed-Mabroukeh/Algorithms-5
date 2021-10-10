import java.util.LinkedList;
import java.util.Queue;

public class RadixSort {

    private  Queue <Integer> queue0 = new LinkedList<>();
    private  Queue <Integer>  queue1 = new LinkedList<>();
    private  Queue <Integer> queue2 = new LinkedList<>();
    private  Queue <Integer> queue3 = new LinkedList<>();
    private  Queue <Integer> queue4 = new LinkedList<>();
    private  Queue <Integer> queue5 = new LinkedList<>();
    private  Queue <Integer> queue6 = new LinkedList<>();
    private  Queue <Integer> queue7 = new LinkedList<>();
    private  Queue <Integer> queue8 = new LinkedList<>();
    private  Queue <Integer> queue9 = new LinkedList<>();

    public void RadixSorting(int array []) {
        String nub = "";
        char Letter = ' ';

                for (int j = 0; j < 10; j++) {
                    for (int i = 0; i < array.length; i++) {
                        nub = array[i] + "";
                        if (nub.length() < j +1 ) {
                            queue0.add(array[i]);
                        } else {
                            String nubN = reverseString(nub);
                            Letter = nubN.charAt(j);
                            //System.out.println(Letter);

                            //// Copy element in array to Queue
                            switch (Letter) {
                                case '0':
                                    queue0.add(array[i]);
                                    break;

                                case '1':
                                    queue1.add(array[i]);
                                    break;

                                case '2':
                                    queue2.add(array[i]);
                                    break;

                                case '3':
                                    queue3.add(array[i]);
                                    break;

                                case '4':
                                    queue4.add(array[i]);
                                    break;

                                case '5':
                                    queue5.add(array[i]);
                                    break;

                                case '6':
                                    queue6.add(array[i]);
                                    break;

                                case '7':
                                    queue7.add(array[i]);
                                    break;

                                case '8':
                                    queue8.add(array[i]);
                                    break;

                                case '9':
                                    queue9.add(array[i]);
                                    break;

                                default:
                                    System.out.println("Don't Number");
                            }
                        }
                    }
                        //// Copy element in Queue to array
                        int start = 0;
                        while (!queue0.isEmpty()) {
                            array[start] = (int) queue0.peek();
                            start++;
                            queue0.remove();
                        }
                        while (!queue1.isEmpty()) {
                            array[start] = (int) queue1.peek();
                            start++;
                            queue1.remove();

                        }
                        while (!queue2.isEmpty()) {
                            array[start] = (int) queue2.peek();
                            start++;
                            queue2.remove();

                        }
                        while (!queue3.isEmpty()) {
                            array[start] = (int) queue3.peek();
                            start++;
                            queue3.remove();

                        }
                        while (!queue4.isEmpty()) {
                            array[start] = (int) queue4.peek();
                            start++;
                            queue4.remove();

                        }
                        while (!queue5.isEmpty()) {
                            array[start] = (int) queue5.peek();
                            start++;
                            queue5.remove();

                        }
                        while (!queue6.isEmpty()) {
                            array[start] = (int) queue6.peek();
                            start++;
                            queue6.remove();

                        }
                        while (!queue7.isEmpty()) {
                            array[start] = (int) queue7.peek();
                            start++;
                            queue7.remove();

                        }
                        while (!queue8.isEmpty()) {
                            array[start] = (int) queue8.peek();
                            start++;
                            queue8.remove();

                        }
                        while (!queue9.isEmpty()) {
                            array[start] = (int) queue9.peek();
                            start++;
                            queue9.remove();
                        }

                    }
        }

    public  String reverseString(String str){
        char ch[]=str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;
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
