package civan;

public class InsertionSort {

    public static int[] sort(int[] A) {
        for (int j = 1; j < A.length; j++) {
            int key = A[j];
            int i = j - 1;
            while ((i >= 0) && (A[i] > key)) {
                A[i + 1] = A[i];
                i = i - 1;
            }
            A[i + 1] = key;
        }
        return A;
    }

    public static int[] descandingSort(int[] a) {
        for (int j = 1; j < a.length; j++) {
            int key = a[j];
            int i = j - 1;
            while ((i >= 0) && (a[i] < key)) {
                a[i + 1] = a[i];
                i = i - 1;
            }
            a[i + 1] = key;
        }
        return a;
    }

}
