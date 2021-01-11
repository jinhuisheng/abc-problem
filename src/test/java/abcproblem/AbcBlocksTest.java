package abcproblem;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AbcBlocksTest {

    @Test
    void should_make_word_false() {
        Assertions.assertThat(AbcBlocks.canMakeWord("CONFUSE")).isEqualTo(true);
        Assertions.assertThat(AbcBlocks.canMakeWord("BOOK")).isEqualTo(false);
        Assertions.assertThat(AbcBlocks.canMakeWord("SQUAD")).isEqualTo(true);
    }
}