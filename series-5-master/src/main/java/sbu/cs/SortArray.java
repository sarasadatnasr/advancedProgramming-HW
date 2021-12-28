package sbu.cs;

public class SortArray {

    /**
     * sort array arr with selection sort algorithm
     * @param arr array of integers
     * @param size size of arrays
     * @return sorted array
     */
    public int[] selectionSort(int[] arr, int size) {
    // One by one move boundary of unsorted subarray
        for (int i = 0; i < size; i++)
    {
        // Find the minimum element in unsorted array
        int min_idx = i;
        for (int j = i+1; j < size; j++)
            if (arr[j] < arr[min_idx])
                min_idx = j;

        // Swap the found minimum element with the first
        // element
        int temp = arr[min_idx];
        arr[min_idx] = arr[i];
        arr[i] = temp;
    }

         return arr;
}

    /**
     * sort array arr with insertion sort algorithm
     * @param arr array of integers
     * @param size size of arrays
     * @return sorted array
     */
    public int[] insertionSort(int[] arr, int size) {
        for (int i = 1; i < size; ++i) {
            int key = arr[i];
            int j = i - 1;
        /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        return arr;
    }

    /**
     * sort array arr with merge sort algorithm
     * @param arr array of integers
     * @param size size of arrays
     * @return sorted array
     */
    public int[] mergeSort(int[] arr, int size) {
        sort(arr, 0, size-1);
        return arr;
    }
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }



    /**
     * return position of given value in array arr which is sorted in ascending order.
     * use binary search algorithm and implement it in iterative form
     * @param arr sorted array
     * @param value value to be find
     * @return position of value in arr. -1 if not exists
     */
    public int binarySearch(int[] arr, int value) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == value)
                return m;

            // If x greater, ignore left half
            if (arr[m] < value)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }

    /**
     * return position of given value in array arr which is sorted in ascending order.
     * use binary search algorithm and implement it in recursive form
     * @param arr sorted array
     * @param value value to be find
     * @return position of value in arr. -1 if not exists
     */
    public int binarySearchRecursive(int[] arr, int value) {
        int result = binarySearch(arr, 0, arr.length - 1, value);
        return result;
    }
    int binarySearch(int arr[], int l,
                     int r, int x)
    {
        //Restrict the boundary of right index
        // and the left index to prevent
        // overflow of indices.
        if (r >= l && l<arr.length-1) {

            int mid = l + (r - l) / 2;

            // If the element is present
            // at the middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then it can only
            // be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present in right
            // subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present in array
        return -1;
    }

}
