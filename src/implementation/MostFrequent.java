package implementation;

import java.util.HashMap;
import java.util.Map;

public class MostFrequent {

    public static Integer getMostFrequentElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = -1;
        Integer mostFrequentKey = null;
        for (Integer num : arr) {
            if (map.containsKey(num)) {
                int value = map.get(num) + 1;
                map.put(num, value);
            } else {
                map.put(num, 1);
            }

            if (max < map.get(num)) {
                max = map.get(num);
                mostFrequentKey = num;
            }
        }

        return mostFrequentKey;
    }
}
