package test;

import implementation.CommonElements;
import junit.framework.TestCase;

import static org.junit.Assert.*;

public class CommonElementsTest extends TestCase {
    public void testCommonElements() {
        int[] array1A = {1, 3, 4, 6, 7, 9};
        int[] array2A = {1, 2, 4, 5, 9, 10};
        assertArrayEquals(CommonElements.getCommonElements(array1A, array2A), (new Integer[]{1, 4, 9}));

        int[] array1B = {1, 2, 9, 10, 11, 12};
        int[] array2B = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};
        assertArrayEquals(CommonElements.getCommonElements(array1B, array2B), (new Integer[]{1, 2, 9, 10, 12}));

        int[] array1C = {0, 1, 2, 3, 4, 5};
        int[] array2C = {6, 7, 8, 9, 10, 11};
        assertArrayEquals(CommonElements.getCommonElements(array1C, array2C), (new Integer[]{}));
    }
}