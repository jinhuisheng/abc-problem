package abcproblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AbcBlocks {
    private static final List<String> SAMPLE_BLOCKS = Arrays.asList(
            "BO", "XK", "DQ", "CP", "NA",
            "GT", "RE", "TG", "QD", "FS",
            "JW", "HU", "VI", "AN", "OB",
            "ER", "FS", "LY", "PC", "ZM");

    public static boolean canMakeWord(String word) {
        List<String> blocks = new ArrayList<>(SAMPLE_BLOCKS);
        return Arrays.stream(word.split(""))
                .noneMatch(oneChar -> notMatch(blocks, oneChar.toUpperCase()));
    }

    static boolean notMatch(List<String> blocks, String oneChar) {
        return !blocks.stream()
                .filter(block -> block.contains(oneChar)).findFirst()
                .map(block -> removeMatchItem(blocks, block)).orElse(false);

    }

    private static Boolean removeMatchItem(List<String> blocks, String block) {
        blocks.remove(block);
        return true;
    }
}