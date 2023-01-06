import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BalancedWordsCounter {

    public int count(String input) {
        if (input == null) {
            throw new RuntimeException("Input cannot be null");
        }
        if (!input.matches("[a-zA-Z]+")) {
            throw new RuntimeException("Input should contain only letters");
        }

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                if (isBalanced(input.substring(i, j + 1))) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isBalanced(String subWord) {
        Map<Character, Integer> characterCountMap = new HashMap<>();
        for (int i = 0; i < subWord.length(); i++) {
            char c = subWord.charAt(i);
            if (characterCountMap.containsKey(c)) {
                characterCountMap.put(c, characterCountMap.get(c) + 1);
            } else {
                characterCountMap.put(c, 1);
            }
        }

        Set<Integer> distinctCounts = new HashSet<>(characterCountMap.values());
        return distinctCounts.size() == 1;
    }
}