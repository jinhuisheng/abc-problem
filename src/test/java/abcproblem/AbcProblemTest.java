package abcproblem;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

public class AbcProblemTest {
    @Test
    void should_test_make_one_length_word() {
        HashMap<String, Boolean> result = AbcProblem.makeWords(Arrays.asList("A"));

        HashMap<String, Boolean> expected = new HashMap<>();
        expected.put("A", true);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_test_make_one_length_word_with_lowercase() {
        HashMap<String, Boolean> result = AbcProblem.makeWords(Arrays.asList("a"));

        HashMap<String, Boolean> expected = new HashMap<>();
        expected.put("a", true);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_test_make_one_word_with_two_length() {
        HashMap<String, Boolean> result = AbcProblem.makeWords(Arrays.asList("AB"));

        HashMap<String, Boolean> expected = new HashMap<>();
        expected.put("AB", true);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_test_make_multiple_words() {
        HashMap<String, Boolean> result = AbcProblem.makeWords(Arrays.asList(
                "A",
                "BARK",
                "BOOK",
                "TREAT",
                "COMMON",
                "SQUAD",
                "CONFUSE"
        ));

        HashMap<String, Boolean> expected = new HashMap<>();
        expected.put("A", true);
        expected.put("BARK", true);
        expected.put("BOOK", false);
        expected.put("TREAT", true);
        expected.put("COMMON", false);
        expected.put("SQUAD", true);
        expected.put("CONFUSE", true);
        assertThat(result).isEqualTo(expected);
    }

}
