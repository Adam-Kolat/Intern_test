import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    public static <T extends Comparable<T>> List<T> sort(List<T> input) throws RuntimeException {
        if (input == null) {
            throw new RuntimeException();
        }
        List<T> result = new ArrayList<>();
        for (T element : input) {
            if (element != null) {
                result.add(element);
            }
        }
        int n = result.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (result.get(j).compareTo(result.get(j + 1)) > 0) {
                    T temp = result.get(j);
                    result.set(j, result.get(j + 1));
                    result.set(j + 1, temp);
                }
            }
        }
        return result;
    }
}