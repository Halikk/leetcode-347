import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3,4,4,4};
        int k = 2;
        int[] result = new int[k];
        Map<Integer, Integer> my_map = new HashMap<>();
        for (int num : nums) {
            my_map.put(num, my_map.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i<k; i++) {
            Map.Entry<Integer, Integer> maxEntry = null;
            for (Map.Entry<Integer, Integer> entry : my_map.entrySet()) {
                if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                    maxEntry = entry;
                }
            }
            result[i] = maxEntry.getKey();
            my_map.remove(maxEntry.getKey());
        }
        System.out.println(Arrays.toString(result));
    }
}
