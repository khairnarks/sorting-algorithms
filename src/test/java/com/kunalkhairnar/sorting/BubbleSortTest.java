package com.kunalkhairnar.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * <h1>Test Cases for Sorting Algorithm - Bubble Sort</h1>
 *
 * This class contains various test cases for testing methods for sorting array using
 * the <b>Bubble Sort</b> algorithm sometimes referred to as Sinking Sort.
 *
 * <p>Bubble Sort is the simplest sorting algorithm that works by repeatedly
 * swapping the adjacent elements if they are in wrong order.
 *
 * @author Kunal Khairnar
 *
 * @see com.kunalkhairnar.sorting.BubbleSort
 * @see <a href="https://en.wikipedia.org/wiki/Bubble_sort">Wikipedia Bubble Sort</a>
 * @see <a href="https://www.geeksforgeeks.org/bubble-sort/">https://www.geeksforgeeks.org/bubble-sort</a>
 *
 */
class BubbleSortTest {

    /**
     * The BubbleSort instance which needs to be tested.
     */
    private BubbleSort bubbleSort;

    /**
     * Initialize th BubbleSort instance prior to each test case method execution.
     */
    @BeforeEach
    public final void init() {
        bubbleSort = new BubbleSort();
    }


    /**
     * Test simple data set for bubble sort.
     */
    @Test
    public void bubbleSort() {
        int[] arr = {7, 5, 1, 4, 2, 8};
        int[] result = {1, 2, 4, 5, 7, 8};
        System.out.println("Array Before sorting - BubbleSort.bubbleSort(): " + Arrays.toString(arr));
        bubbleSort.bubbleSort(arr);
        assertArrayEquals(result, arr);
        System.out.println("Array After sorting - BubbleSort.bubbleSort(): " + Arrays.toString(arr));

    }

    /*---------------------------------
     * Test Cases for the optimized method bubbleSort2()
    ---------------------------------*/

    /**
     * Test simple data set for bubble sort optimized implementation.
     */
    @Test
    public void bubbleSort2() {
        int[] arr = {7, 5, 1, 4, 2, 8};
        int[] result = {1, 2, 4, 5, 7, 8};
        System.out.println("Array Before sorting - BubbleSort.bubbleSort2(): " + Arrays.toString(arr));
        bubbleSort.bubbleSort(arr);
        assertArrayEquals(result, arr);
        System.out.println("Array After sorting - BubbleSort.bubbleSort2(): " + Arrays.toString(arr));

    }
}