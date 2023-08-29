
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
     public void selectionSort(int[] arr)
    {
        // put your code here
        for(int i = 0; i < arr.length - 1; i++)
        {
            int minimumLocation = i;
            for(int j = i; j < arr.length; j++)
            {
                if (arr[minimumLocation] > arr[j])
                {
                    minimumLocation = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minimumLocation];
            arr[minimumLocation] = temp;
        }
        
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
    
    public void bubbleSort(int[] arr)
    {
        
        for (int i = 0; i < arr.length -1; i++)
        {
            for (int j = 0; j < arr.length- 1; j++) 
            {
                if (arr[j] > arr[j +1])
                {
                    int temp = arr[j+ 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    
                }
            }
        }
    }
    public void bubbleTest()
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
    
    
}
