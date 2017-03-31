import java.util.Scanner;

/**
 * Created by vivekk on 3/31/2017.
 */
public class Equality {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        System.out.print(getMinDiff(input, n, k));


    }

    public static int getMinDiff(int arr[], int n, int k)
    {
        // There should be at least two elements
        if (n <= 1)
            return 0;

        // Sort array in increasing order
        bubble_srt(arr);

        // Initialize maximum and minimum
        int maxe = arr[n-1];
        int mine = arr[0];

        // If k is more than difference between maximum
        // and minimum, add/subtract k to all elements
        // as k cannot decrease the difference
        if (k >= maxe - mine)
        {
            for (int i=0; i<n; i++)
                arr[i] += k; // Subtract would also work
            return (maxe - mine);
        }

        // In sorted array, first element is minimum
        // and last is maximum, we must add k to minium
        // and subtract k from maximum
        arr[0]   += k;
        arr[n-1] -= k;

        // Initialize mac and min of modified array (only
        // two elements have been finalized)
        int new_max = arr[0] > arr[n-1] ? arr[0] : arr[n-1];
        int new_min = arr[0] < arr[n-1] ? arr[0] : arr[n-1];

        // Finalize middle n-2 elements
        for (int j=1; j<n-1; j++)
        {
            // If current element is less than min of
            // modified array, add k.
            if (arr[j] < new_min)
                arr[j] += k;

                // If current element is more than max of
                // modified array, subtract k.
            else if (arr[j] > new_max)
                arr[j] -= k;

                // arr[j] is between new_min and new_max

                // If arr[j] is closer to new_max, subtract k
            else if ((arr[j] - new_min) > (new_max - arr[j]))
                arr[j] -= k;

                // Else add k
            else
                arr[j] += k;

            // Update new_max and new_min if required
            new_max = arr[j] > new_max ? arr[j] : new_max;
            new_min = arr[j] < new_min ? arr[j] : new_min;
        }

        // Returns difference between new_max and new_min
        return (new_max - new_min);
    }

    public static int[] bubble_srt(int array[]) {
        int n = array.length;
        int k;
        int[] sortedArray = new int[n];
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            sortedArray = array;
        }
        return sortedArray;
    }

    private static void swapNumbers(int i, int j, int[] array) {

        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
