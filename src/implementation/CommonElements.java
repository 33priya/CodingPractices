package implementation;

import java.util.ArrayList;
import java.util.List;

public class CommonElements {

    public static Integer[] getCommonElements(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                result.add(a[i]);
                ++i;
                ++j;
            } else if (a[i] > b[j]) {
                ++j;
            } else {
                ++i;
            }
        }

        Integer[] resultInArray = new Integer[result.size()];
        return result.toArray(resultInArray);
    }
}
