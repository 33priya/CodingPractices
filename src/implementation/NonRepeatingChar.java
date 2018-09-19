package implementation;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar {

    public static Character nonRepeating(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char key : str.toCharArray()) {
            if (map.containsKey(key)) {
                int value = map.get(key) + 1;
                map.put(key, value);
            } else {
                map.put(key, 1);
            }
        }

        for (char key : str.toCharArray()) {
            if (map.get(key) == 1) {
                return key;
            }
        }

        return null;
    }
}
