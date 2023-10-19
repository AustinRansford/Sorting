public class Sorting
{
    // instance variables - replace the example below with your own
    private static long mComparisons = 0; //mergeComparisons
    private static long mSwaps = 0;// mergeSwaps
    private int x;

    public Sorting() {
        // initialise instance variables
        x = 0;
    }

    /**
     * sorts an array of numbers according to the selection sorting procedure
     *
     * @param  arr is a filled array of integers 
     * @return   void 
     */
     public static void selectionSort(int[] arr) {
        long comparisons = 0;
        long swaps = 0;
        
        for (int i = 0; i < arr.length - 1; i++) {
            int minimumLocation = i;
            for (int j = i; j < arr.length; j++) {
                comparisons++;
                if (arr[minimumLocation] > arr[j]) {
                    minimumLocation = j;
                }
            }
            comparisons++;
            if ( minimumLocation != i){
                int temp = arr[i];
                arr[i] = arr[minimumLocation];
                arr[minimumLocation] = temp;
                swaps++;
            }
        }
        
        System.out.print( ", " + comparisons + " , " + swaps );
    } 
    
    public void selectionTest() {
        int[] arr = {70, 5, 29, 54, -4, 89, 100, 0, 0 -100, 5};
        
        for (int num: arr) {
            System.out.print(num + " ");
        }
        
        System.out.println("");
        selectionSort(arr);
        
        for (int num: arr) {
            System.out.println(num);
        }
    }
    
    /**
     * sorts an array of numbers according to the bubble sorting procedure
     *
     * @param  arr is a filled array of integers 
     * @return   void 
     */
    public static void bubbleSort(int[] arr) {
        long comparisons = 0;
        long swaps = 0;
        
        for (int i = 0; i < arr.length - 1; i++) {
            boolean sorted = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                comparisons++;
                if (arr[j] > arr[j +1]) {
                    sorted = false;
                    int temp = arr[j+ 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swaps++;
                }
            }
            if (sorted){
                break;
            }
        }
        
        System.out.print( ", " + comparisons + " , " + swaps );
    }
    
    public  void bubbleTest() {
        int[] arr = {70, 5, 29, 54, -4, 89, 100, 0, 0 -100, 5};
        
        for (int num: arr) {
            System.out.print(num + " ");
        }
        
        System.out.println("");
        bubbleSort(arr);
        
        for (int num: arr) {
            System.out.println(num);
        }
    }
    
    /**
     * sorts an array of numbers according to the insertion sorting procedure
     *
     * @param  arr is a filled array of integers 
     * @return   void 
     */
    public static void insertionSort(int[] arr) {
        long comparisons = 0;
        long swaps = 0;
        
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int currentLocation = i;
            while(currentLocation > 0 
                    && temp < arr[currentLocation - 1]) {
                comparisons++;
                arr[currentLocation] = arr[currentLocation - 1];
                swaps++;
                currentLocation--;
            }
            arr[currentLocation] = temp;
            swaps++;
        }
        
        System.out.print( ", " + comparisons + " , " + swaps / 3 );
    }
    
    public void insertionTest() {
        int[] arr = {70, 5, 29, 54, -4, 89, 100, 0, 0 -100, 5};
        
        for (int num: arr) {
            System.out.print(num + " ");
        }
        
        System.out.println("");
        insertionSort(arr);
        
        for (int num: arr) {
            System.out.println(num);
        }
    }
    
    /**
     * sorts an array of numbers according to the merge sorting procedure
     *
     * @param  arr is a filled array of integers 
     * @return   void 
     */
    public static void mergeSort(int[] arr) {
        mergeSort(0, arr.length - 1, arr);
        System.out.print( ", " + mComparisons + " , " + mSwaps );
    }
    
    /**
     * Is the recursive call to breakdown the array into pieces which then is 
     * passed into the merge method
     *
     * @param  start represents the start index value of the partition  
     * @param end represents the end index value of the partition 
     * of arr that is being examined. 
     * @param arr is a filled array of integers 
     * @return   void 
     */
    public static void mergeSort(int start, int end, int[] arr) {
        int mid = (end + start) / 2;
        
        if (start == end) {
            return;
        } else if (end - start == 2){
            if (arr[end] < arr[start]) {
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
                return;
            }
        } else {
            mergeSort(start, mid, arr);
            mergeSort(mid + 1, end, arr);
            mergeSort(start, mid, end, arr);
        }
    }
    
    public static void mergeSort(int start, int mid, int end, int[] arr) {
        int i = start;
        int j = mid + 1; 
        int[] mergedArray = new int[end - start + 1];
        int location = 0;
        
        while (i <= mid && j <= end) {
            mComparisons++;
            if (arr[i] < arr[j]) { 
                mergedArray[location] = arr[i];
                i++;
                location++;
                mSwaps++;
            } else {
                mergedArray[location] = arr[j];
                j++;
                location++;
            }
        } 
        
        while (i <= mid) {
            mergedArray[location] = arr[i];
            i++;
            location++;
            mSwaps++;
        }
        
        while (j <= end) {
            mergedArray[location] = arr[j];
            j++;
            location++;
            mSwaps++;
        }
        
        for (int c = start; c <= end; c++) {
            arr[c] = mergedArray[c - start];
        }
    }
    
    public void mergeTest() {
        int[] arr = {70, 5, 29, 54, -4, 89, 100, 0, 0 -100, 5};
        
        for (int num: arr) {
            System.out.print(num + " ");
        }
        
        System.out.println("");
        mergeSort(arr);
        
        for (int num: arr) {
            System.out.println(num);
        }
    }
}
