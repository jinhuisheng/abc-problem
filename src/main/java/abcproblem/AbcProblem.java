package abcproblem;

import java.util.HashMap;
import java.util.List;

public class AbcProblem {

    public static HashMap<String, Boolean> makeWords(List<String> words) {
        HashMap<String, Boolean> expected = new HashMap<>();
        for (String word : words) {
            expected.put(word, AbcBlocks.canMakeWord(word));
        }
        return expected;
    }

}
