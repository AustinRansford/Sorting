
/**
 * Write a description of class Sorting here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sorting
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Sorting
     */
    public Sorting()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
     public static void selectionSort(int[] arr)
    {
        // put your code here
        int comparisons = 0;
        int swaps = 0;
        for(int i = 0; i < arr.length - 1; i++)
        {
            int minimumLocation = i;
            for(int j = i; j < arr.length; j++)
            {
                comparisons++;
                if (arr[minimumLocation] > arr[j])
                {
                    minimumLocation = j;
    
                }
            }
            int temp = arr[i];
            arr[i] = arr[minimumLocation];
            arr[minimumLocation] = temp;
            swaps++;
        }
        System.out.print( " " +comparisons + " , " + swaps );
    }
    public void selectionTest()
    {
        int[] arr = {70, 5, 29, 54, -4, 89, 100, 0, 0 -100, 5};
        for (int num: arr)
        {
            System.out.print(num + " ");
        }
        System.out.println("");
        selectionSort(arr);
        for (int num: arr)
        {
            System.out.println(num);
        }
    }
    
    public static void bubbleSort(int[] arr)
    {
        long comparisons = 0;
        int swaps = 0;
        for (int i = 0; i < arr.length -1; i++)
        {
            for (int j = 0; j < arr.length- 1; j++) 
            {
                comparisons++;
                if (arr[j] > arr[j +1])
                {
                    int temp = arr[j+ 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swaps++;

                }
            }
        }
        System.out.print( " " +comparisons + " , " + swaps );
    }
    public  void bubbleTest()
    {
        int[] arr = {70, 5, 29, 54, -4, 89, 100, 0, 0 -100, 5};
        for (int num: arr)
        {
            System.out.print(num + " ");
        }
        System.out.println("");
        bubbleSort(arr);
        for (int num: arr)
        {
            System.out.println(num);
        }
    }
    public static void insertionSort(int[] arr)
    {
        int comparisons = 0;
        int swaps = 0;
        for (int i = 1; i < arr.length; i++)
        {
            int temp = arr[i];
            int currentLocation = i;
            while(currentLocation > 0 && temp < arr[currentLocation - 1] )
            {
                comparisons++;
                arr[currentLocation] = arr[currentLocation -1];
                swaps++;
                currentLocation--;
            }
            arr[currentLocation] = temp;
            swaps++;
        }
        System.out.print( " " +comparisons + " , " + swaps/3 );
    }
     public void insertionTest()
    {
        int[] arr = {70, 5, 29, 54, -4, 89, 100, 0, 0 -100, 5};
        for (int num: arr)
        {
            System.out.print(num + " ");
        }
        System.out.println("");
        insertionSort(arr);
        for (int num: arr)
        {
            System.out.println(num);
        }
    }
    public static void mergeSort(int[] arr)
    {
        mergeSorting(0, arr.length - 1, arr);
        
    }
    public static void mergeSorting(int start, int end, int[] arr)
    {
        int mid = (end + start) / 2;
        if(start == end)
        {
            return;
        }
        else
        {
            mergeSorting(start, mid, arr);
            mergeSorting(mid +1, end, arr);
            merge(start, mid, end, arr);
        }
    }
    public static void merge(int start, int mid, int end, int[] arr)
    {
        int i = start;
        int j = mid + 1; 
        int[] mergedArray = new int[arr.length];
        int location = 0;
        while (i <= mid && j <= end)
        {
            if (arr[i] < arr[j])
            {
                // creates new array that should be sorted in the bounds
                //of the start and end 
                mergedArray[location] = arr[i];
                i++;
                location++;
               // for (int num: arr)
                //{
                //    System.out.println(num + " ");
               // }
            }
            else
            {
                mergedArray[location] = arr[j];
                j++;
                location++;
            }
        } 
        while (i <= mid)
        {
            mergedArray[location] = arr[i];
            i++;
            location++;
        }
        while (j <= end)
        {
            mergedArray[location] = arr[j];
            j++;
            location++;
        }
        
        for (int c = start; c <= end; c++)
        {
            arr[c] = mergedArray[c - start];
        }
    }
    public void mergeTest()
    {
        int[] arr = {70, 5, 29, 54, -4, 89, 100, 0, 0 -100, 5};
        for (int num: arr)
        {
            System.out.print(num + " ");
        }
        System.out.println("");
        mergeSort(arr);
        for (int num: arr)
        {
            System.out.println(num);
        }
    }
}
