package abcproblem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AbcProblem {

    public static Map<String, Boolean> makeWords(List<String> words) {
        Map<String, Boolean> expected = new HashMap<>();
        for (String word : words) {
            expected.put(word, AbcBlocks.canMakeWord(word));
        }
        return expected;
    }

}
