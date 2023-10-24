
import java.util.HashMap;
import java.util.Map;

public class FrequencyInt {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{9,3,9,3,9,7,9}));
    }

    public static int solution(int[] A){
        HashMap<Integer, Integer> frequency = new HashMap<Integer, Integer>();
        int result = Integer.MIN_VALUE;

        // cycle through array add 1 to value count, else add key
        for (Integer element: A) {
            frequency.put(element, frequency.getOrDefault(element, 0) +1);
        }

        for (Map.Entry<Integer, Integer> element: frequency.entrySet()) {
            if (element.getValue() % 2 == 1)
                result = element.getKey();
        }

        return result;
    }
}
