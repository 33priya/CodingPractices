package test;

import implementation.ArrayRotation;
import junit.framework.TestCase;

public class ArrayRotationTest extends TestCase {

    public void testIsRotation() {
        int[] array1A = {1, 2, 3, 4, 5, 6, 7};

        int[] array2A = {4, 5, 6, 7, 8, 1, 2, 3};
        assertTrue(!ArrayRotation.isRotation(array1A, array2A));

        int[] array2B = {4, 5, 6, 7, 1, 2, 3};
        assertTrue(ArrayRotation.isRotation(array1A, array2B));

        int[] array2C = {4, 5, 6, 9, 1, 2, 3};
        assertTrue(!ArrayRotation.isRotation(array1A, array2C));

        int[] array2D = {4, 6, 5, 7, 1, 2, 3};
        assertTrue(!ArrayRotation.isRotation(array1A, array2D));

        int[] array2E = {4, 5, 6, 7, 0, 2, 3};
        assertTrue(!ArrayRotation.isRotation(array1A, array2E));

        int[] array2F = {1, 2, 3, 4, 5, 6, 7};
        assertTrue(ArrayRotation.isRotation(array1A, array2F));
    }
}