package civan;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] testArray = {1,2,3,5,4,0,4,3,4,2,1,4,8,5,4,4};
    Quicksort.sortWith3WayPart(testArray,0,testArray.length-1);
        Arrays.stream(testArray).forEach(x -> System.out.println(" " + x));
    }
}
