package test;

import implementation.MostFrequent;
import junit.framework.TestCase;

public class MostFrequentTest extends TestCase {

    public void testMostFrequent() {
        int[] arr1 = {1,3,1,2,1,3};
        assertEquals(MostFrequent.getMostFrequentElement(arr1),Integer.valueOf(1));

        int[] arr2 = {3, 3, 1, 3, 2, 1};
        assertEquals(MostFrequent.getMostFrequentElement(arr2), Integer.valueOf(3));

        int[] arr3 = {};
        assertEquals(MostFrequent.getMostFrequentElement(arr3),null);

        int[] arr4 = {0};
        assertEquals(MostFrequent.getMostFrequentElement(arr4),Integer.valueOf(0));

        int[] arr5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};
        assertEquals(MostFrequent.getMostFrequentElement(arr5),Integer.valueOf(-1));
    }
}