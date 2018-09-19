package implementation;

public class ArrayRotation {
    public static boolean isRotation(int[] a, int[] b) {
        if (a.length != b.length) return false;

        int key = a[0];
        int keyIndex = -1;

        for (int i = 0; i < b.length; ++i) {
            if (b[i] == key) {
                keyIndex = i;
                break;
            }
        }

        if (keyIndex == -1) return false;

        for (int i = 0; i < a.length; ++i) {
            int j = (i + keyIndex) % a.length;
            if (a[i] != b[j]) {
                return false;
            }
        }

        return true;
    }
}
