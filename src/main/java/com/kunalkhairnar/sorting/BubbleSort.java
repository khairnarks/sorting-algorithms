package com.kunalkhairnar.sorting;

/**
 * <h1>Sorting Algorithm - Bubble Sort</h1>
 * <p>
 * This class contains various methods for sorting array using
 * the <b>Bubble Sort</b> algorithm sometimes referred to as Sinking Sort.
 *
 * <p>The documentation for the methods contained in this class includes
 * brief description of the <i>implementations</i>. Such descriptions should
 * be regarded as <i>implementation notes</i>
 *
 * <p>Bubble Sort is the simplest sorting algorithm that works by repeatedly
 * swapping the adjacent elements if they are in wrong order.
 *
 * <p><b>Time Complexity and Space Complexity</b></p>
 * <ul>
 * <li>Worst-case performance O (n^2)</li>
 * <li>Best-case performance O(n) - Best case occurs when array is already sorted.</li>
 * <li>Average performance O(n^2) - Worst case occurs when array is reverse sorted.</li>
 * <li>Worst-case space complexity O(1)</li>
 * <li>Sorting In Place: Yes</li>
 * <li>Stable: Yes</li>
 * </ul>
 *
 * @author Kunal Khairnar
 * @see <a href="https://en.wikipedia.org/wiki/Bubble_sort">Wikipedia Bubble Sort</a>
 * @see <a href="https://www.geeksforgeeks.org/bubble-sort/">https://www.geeksforgeeks.org/bubble-sort</a>
 */
public class BubbleSort {


    /**
     * Sorts the specified array into ascending numerical order using Bubble Sort.
     *
     * <p>Implementation note: The sorting algorithm is a Bubble Sort.
     * This algorithm offers O(n^2) (n square/ n * n) performance
     * on many data sets to quadratic performance, where n is number of elements in the array.
     *
     * <ul>
     * <li>Worst-case performance O (n^2)</li>
     * <li>Best-case performance O(n) - Best case occurs when array is already sorted.</li>
     * <li>Average performance O(n^2) - Worst case occurs when array is reverse sorted.</li>
     * <li>Worst-case space complexity O(1)</li>
     * <li>Sorting In Place: Yes</li>
     * <li>Stable: Yes</li>
     * </ul>
     *
     * @param arr the array to be sorted cannot be null.
     */
    public void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {
                // swap elements arr[j] with arr[j+1] if not in desired order
                if (arr[j] > arr[j + 1]) {
                    int val = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = val;
                }
            }
        }
    }

    /**
     * Sorts the specified array into ascending numerical order using Bubble Sort.
     * The optimized implementation by stopping the algorithm if inner loop didn’t
     * cause any swap.
     *
     * <p>Implementation note: The sorting algorithm is a Bubble Sort.
     * This algorithm offers O(n^2) (n square/ n * n) performance
     * on many data sets to quadratic performance, where n is number of elements in the array.
     *
     * <ul>
     * <li>Worst-case performance O(n^2)</li>
     * <li>Best-case performance O(n) - Best case occurs when array is already sorted.</li>
     * <li>Average performance O(n^2) - Worst case occurs when array is reverse sorted.</li>
     * <li>Worst-case space complexity O(1)</li>
     * <li>Sorting In Place: Yes</li>
     * <li>Stable: Yes</li>
     * </ul>
     *
     * @param arr the array to be sorted cannot be null.
     */
    public static void bubbleSort2(int[] arr) {
        boolean needNextPass = true;

        for (int k = 1; k < arr.length && needNextPass; k++) {
            // Array may be sorted and next pass not needed
            needNextPass = false;
            for (int i = 0; i < arr.length - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Swap list[i] with list[i + 1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    needNextPass = true; // Next pass still needed
                }
            }
        }
    }

}
