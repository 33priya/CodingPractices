package implementation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MultiplyToTwenty {

    public static void main(String[] args) {
        int[] arr = {2,4,1,6,5,40,-1};
        findNumbers(arr, 20);
        findPairUsingSet(arr, 20);
        findPairUsingMap(arr, 20);
    }

    private static void findNumbers(int[] arr, int x) {
        for (int i = 0; i < arr.length; ++i) {
            int a = arr[i];
            if (a == 0) continue;

            int b = x/a;
            for (int j = i; j < arr.length; ++j) {
                if (arr[j] == b) {
                    System.out.println(a + " * " + b + " = " + x);
                    break;
                }
            }
        }
    }

    private static void findPairUsingSet(int[] arr, int x) {
        Set<Integer> set = new HashSet<>();
        for (Integer num : arr) {
            if (num == 0) continue;

            set.add(num);
            int b = x/num;
            if (set.contains(b)) {
                System.out.println(num + " * " + b + " = " + x);
                break;
            }
        }
    }

    private static void findPairUsingMap(int[] arr, int x) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : arr) {
            if (num == 0) continue;

            int b = x/num;
            if (map.containsKey(b)) {
                System.out.println(num + " * " + b + " = " + x);
                break;
            }

            map.put(num, b);
        }
    }
}
