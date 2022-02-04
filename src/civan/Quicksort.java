package civan;

import java.util.Arrays;

public class Quicksort {
    private static void medianOfThree(int[] A, int l, int h){
        int mid = l+(h-l)/2;
        int[] values = new int[]{A[l],A[mid],A[h]};
        Arrays.sort(values);
        int median = values[1];
        //if median is the first element then swap with the last
        if(median == A[l]){
            swap(A,l,h);
        }
        //if median is the middle element then swap with the last
        if(median == A[mid]){
            swap(A,mid,h);
        }
        //if median is last element do nothing
    }

    public static void sortWithInsertion(int[] A, int p, int r, int k) {
        _sortWithInsertion(A, p, r, k);
        InsertionSort.sort(A);
    }

    private static void _sortWithInsertion(int[] A, int p, int r, int k) {
        if (p < r) {
            int q = partition(A, p, r);
            if (q - p >= k) {
                _sortWithInsertion(A, p, q - 1, k);
            }
            if (r - q + 1 >= k) {
                _sortWithInsertion(A, q + 1, r, k);
            }
        }
    }



    public static void sort(int[] A, int p, int r) {
        if (p < r) {
            int q = partition(A, p, r);
            sort(A, p, q - 1);
            sort(A, q + 1, r);

        }
    }

    public static void sortWithMedianOf3(int[] A, int p, int r){
        if (p < r) {
            medianOfThree(A,p,r);
            int q = partition(A, p, r);
            sortWithMedianOf3(A, p, q - 1);
            sortWithMedianOf3(A, q + 1, r);
        }
    }


    public static int partition(int[] A, int p, int r) {
        int x = A[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (A[j] <= x) {
                i = i + 1;
                swap(A, i, j);
            }
        }
        swap(A, i + 1, r);
        return i + 1;
    }



    private static void swap(int[] A, int i, int k) {
        int temp = A[k];
        A[k] = A[i];
        A[i] = temp;
    }
}
